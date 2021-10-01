package com.vdm.msgwebservice.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.vdm.msgwebservice.entity.*;
import com.vdm.msgwebservice.model.*;
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
@RequestMapping("/API/V1/FSU/")
public class MessageController {
    private final String filepath = "C:\\Users\\Stanislav.Khodyrev\\Desktop\\temp pdi\\";
    //centos to path = "/WebService/MsgWebService/msgs/"
    private final MessageRepository messageRepository;
    private final UserRepository userRepository;
    private JsonObject request;
    private Validator validator;

    @Autowired
    public MessageController(MessageRepository messageRepository, UserRepository userRepository) {
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
    }

    @PostMapping(path = {"/FSU_DEP", "/FSU_BKD", "/FSU_MAN", "/FSU_PRE"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody JsonObject fsuDep(@org.springframework.web.bind.annotation.RequestBody String jsonString) {
        Gson g = new Gson();
        FsuDepBody fsuDepBody = g.fromJson(jsonString, FsuDepBody.class);

        validator = new Validator();
        List<String> errors = validator.getListFsuDepErrors(fsuDepBody);
        if (!validateMessageBody(errors))
            return request;

        Message fsu = createFsuDepMsg(fsuDepBody);
        messageRepository.save(fsu);

        fsu.saveToFile(filepath);
        JsonObject jsonObject = requestOk(fsu);

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

        fsu.saveToFile(filepath);

        return requestOk(fsu);
    }

    @PostMapping(path = {"/FSU_AWD","/FSU_DLV"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody JsonObject fsuAwd(@org.springframework.web.bind.annotation.RequestBody String jsonString) {

        Gson g = new Gson();
        FsuAwdBody fsuAwdBody = g.fromJson(jsonString, FsuAwdBody.class);

        validator = new Validator();
        List<String> errors = validator.getListFsuAwdErrors(fsuAwdBody);
        if (!validateMessageBody(errors))
            return request;

        Message fsu = createFsuAwdMsg(fsuAwdBody);
        messageRepository.save(fsu);

        fsu.saveToFile(filepath);

        return requestOk(fsu);
    }

    @PostMapping(path = "/FSU_AWR", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody JsonObject fsuAwr(@org.springframework.web.bind.annotation.RequestBody String jsonString) {
        return fsuArr(jsonString);
    }

    @PostMapping(path = "/FSU_CRC", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody JsonObject fsuCrc(@org.springframework.web.bind.annotation.RequestBody String jsonString) {
        Gson g = new Gson();
        FsuCrcBody fsuCrcBody = g.fromJson(jsonString, FsuCrcBody.class);

        validator = new Validator();
        List<String> errors = validator.getListFsuCrcErrors(fsuCrcBody);
        if (!validateMessageBody(errors))
            return request;

        Message fsu = createFsuCrcMsg(fsuCrcBody);
        messageRepository.save(fsu);

        fsu.saveToFile(filepath);

        return requestOk(fsu);
    }

    @PostMapping(path = "/FSU_DDL", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody JsonObject fsuDdl(@org.springframework.web.bind.annotation.RequestBody String jsonString) {
        Gson g = new Gson();
        FsuDdlBody fsuDdlBody = g.fromJson(jsonString, FsuDdlBody.class);

        validator = new Validator();
        List<String> errors = validator.getListFsuDdlErrors(fsuDdlBody);
        if (!validateMessageBody(errors))
            return request;

        Message fsu = createFsuDdlMsg(fsuDdlBody);
        messageRepository.save(fsu);

        fsu.saveToFile(filepath);

        return requestOk(fsu);
    }

    @PostMapping(path = "/FSU_CCD", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody JsonObject fsuCcd(@org.springframework.web.bind.annotation.RequestBody String jsonString) {
        Gson g = new Gson();
        FsuCcdBody fsuCcdBody = g.fromJson(jsonString, FsuCcdBody.class);

        validator = new Validator();
        List<String> errors = validator.getListFsuCcdErrors(fsuCcdBody);
        if (!validateMessageBody(errors))
            return request;

        Message fsu = createFsuCcdMsg(fsuCcdBody);
        messageRepository.save(fsu);

        fsu.saveToFile(filepath);

        return requestOk(fsu);
    }

    @PostMapping(path = "/FSU_FOH", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody JsonObject fsuFoh(@org.springframework.web.bind.annotation.RequestBody String jsonString) {
        Gson g = new Gson();
        FsuFohBody fsuFohBody = g.fromJson(jsonString, FsuFohBody.class);

        validator = new Validator();
        List<String> errors = validator.getListFsuFohErrors(fsuFohBody);
        if (!validateMessageBody(errors))
            return request;

        Message fsu = createFsuFohMsg(fsuFohBody);
        messageRepository.save(fsu);

        fsu.saveToFile(filepath);

        return requestOk(fsu);
    }

    @PostMapping(path = "/FSU_DIS", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody JsonObject fsuDis(@org.springframework.web.bind.annotation.RequestBody String jsonString) {
        Gson g = new Gson();
        FsuDisBody fsuDisBody = g.fromJson(jsonString, FsuDisBody.class);

        validator = new Validator();
        List<String> errors = validator.getListFsuDisErrors(fsuDisBody);
        if (!validateMessageBody(errors))
            return request;

        Message fsu = createFsuDisMsg(fsuDisBody);
        messageRepository.save(fsu);

        fsu.saveToFile(filepath);

        return requestOk(fsu);
    }

    @PostMapping(path = "/FSU_NFD", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody JsonObject fsuNfd(@org.springframework.web.bind.annotation.RequestBody String jsonString) {
        Gson g = new Gson();
        FsuNfdBody fsuNfdBody = g.fromJson(jsonString, FsuNfdBody.class);

        validator = new Validator();
        List<String> errors = validator.getListFsuNfdErrors(fsuNfdBody);
        if (!validateMessageBody(errors))
            return request;

        Message fsu = createFsuNfdMsg(fsuNfdBody);
        messageRepository.save(fsu);

        fsu.saveToFile(filepath);

        return requestOk(fsu);
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
