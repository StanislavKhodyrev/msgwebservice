package com.vdm.msgwebservice.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.vdm.msgwebservice.entity.*;
import com.vdm.msgwebservice.model.FsuArrBody;
import com.vdm.msgwebservice.model.FsuAwdBody;
import com.vdm.msgwebservice.model.FsuDepBody;
import com.vdm.msgwebservice.model.Validator;
import com.vdm.msgwebservice.repository.MessageRepository;
import com.vdm.msgwebservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.vdm.msgwebservice.entity.Message.*;

@Controller
public class MessageController {
    private final MessageRepository messageRepository;
    private final UserRepository userRepository;
    private JsonObject request;
    private Validator validator;

    @Autowired
    public MessageController(MessageRepository messageRepository, UserRepository userRepository) {
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
    }

    @PostMapping(path = "/FSU_DEP", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody JsonObject fsuDep(@org.springframework.web.bind.annotation.RequestBody String jsonString) {
        Gson g = new Gson();
        FsuDepBody fsuDepBody = g.fromJson(jsonString, FsuDepBody.class);

        validator = new Validator();
        List<String> errors = validator.getListFsuDepErrors(fsuDepBody);
        if (!validateMessageBody(errors))
            return request;

        Message fsu = createFsuDepMsg(fsuDepBody);
        messageRepository.save(fsu);

        //fsu.saveToFile("/WebService/MsgWebService/msgs/");
        fsu.saveToFile("C:\\Users\\Stanislav.Khodyrev\\Desktop\\temp pdi\\");
        JsonObject jsonObject = requestOk(fsu);
        System.out.println(jsonObject);
        return jsonObject;
    }

    @PostMapping(path = "/FSU_ARR", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody JsonObject fsuArr(@org.springframework.web.bind.annotation.RequestBody String jsonString) {

        Gson g = new Gson();
        FsuArrBody fsuArrBody = g.fromJson(jsonString, FsuArrBody.class);

        validator = new Validator();
        List<String> errors = validator.getListFsuArrErrors(fsuArrBody);
        if (!validateMessageBody(errors))
            return request;

        Message fsu = createFsuArrMsg(fsuArrBody);
        messageRepository.save(fsu);

        //fsu.saveToFile("/WebService/MsgWebService/msgs/");
        fsu.saveToFile("C:\\Users\\Stanislav.Khodyrev\\Desktop\\temp pdi\\");

        return requestOk(fsu);
    }

    @PostMapping(path = "/FSU_AWD", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody JsonObject fsuAwd(@org.springframework.web.bind.annotation.RequestBody String jsonString) {

        Gson g = new Gson();
        FsuAwdBody fsuAwdBody = g.fromJson(jsonString, FsuAwdBody.class);

        validator = new Validator();
        List<String> errors = validator.getListFsuAwdErrors(fsuAwdBody);
        if (!validateMessageBody(errors))
            return request;

        Message fsu = createFsuAwdMsg(fsuAwdBody);
        messageRepository.save(fsu);

        //fsu.saveToFile("/WebService/MsgWebService/msgs/");
        fsu.saveToFile("C:\\Users\\Stanislav.Khodyrev\\Desktop\\temp pdi\\");

        return requestOk(fsu);
    }

    @PostMapping(path = "/FSU_AWR", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody JsonObject fsuAwr(@org.springframework.web.bind.annotation.RequestBody String jsonString) {
        return fsuArr(jsonString);
    }


    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    private boolean validateMessageBody(List<String> errors) {
        boolean result = true;
        request = new JsonObject();
        if (!errors.isEmpty()) {
            request.addProperty("status", HttpStatus.BAD_REQUEST.toString());
            request.addProperty("msggid", "");
            request.addProperty("errors", errors.toString());
            result = false;
        }
        return result;
    }

    private JsonObject requestOk(Message message) {
        request = new JsonObject();
        request.addProperty("status", HttpStatus.OK + " (Message sending successfully)");
        request.addProperty("msggid", message.getId());
        request.addProperty("errors", "");
        return request;
    }
}
