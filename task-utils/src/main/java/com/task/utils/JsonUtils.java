package com.task.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author YangQX   2022/4/10 - 15:34
 */
@Configuration
public class JsonUtils
{

    @Bean
    public static Gson getGson()
    {
        Gson gson = new Gson();
        return gson;
    }
}
