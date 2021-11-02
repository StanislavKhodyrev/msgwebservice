package com.vdm.msgwebservice.waybillevwnt.controller;


import com.vdm.msgwebservice.waybillevwnt.xml.XmlCreator;
import org.jdom2.Document;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/API/")
public class ApiController {
    private XmlCreator creator;

    @Autowired
    public ApiController(XmlCreator creator) {
        this.creator = creator;
    }

    @GetMapping(value = "/GetAWBInfo", produces = { MediaType.APPLICATION_XML_VALUE })
    public String getAWBInfo(@RequestParam String param) {

        Document doc = null;
        XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
        try {
            doc  = creator.createDocument(param);
        } catch (EmptyResultDataAccessException e) {
            doc = creator.createNullDocument(param);
        }
        return outputter.outputString(doc);
    }

}