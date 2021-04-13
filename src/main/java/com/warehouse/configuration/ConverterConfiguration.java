package com.warehouse.configuration;

import com.warehouse.converter.WarehouseDtoWarehouseConverter;
import com.warehouse.converter.WarehouseWarehouseDtoConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConverterConfiguration implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new WarehouseDtoWarehouseConverter());
        registry.addConverter(new WarehouseWarehouseDtoConverter());
    }

}
