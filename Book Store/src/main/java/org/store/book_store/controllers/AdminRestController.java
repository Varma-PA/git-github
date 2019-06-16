package org.store.book_store.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.store.book_store.services.IAdminService;

@RestController
@CrossOrigin("*")
public class AdminRestController {

    private static final Logger Log = LoggerFactory.getLogger(AdminRestController.class);

    @Autowired
    IAdminService adminService;



}
