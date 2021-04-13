package com.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;

public abstract class BaseController {

    protected final ConversionService conversionService;

    @Autowired
    public BaseController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

}
