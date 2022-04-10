package com.task.utils;

import java.util.UUID;

/**
 * @author YangQX   2022/4/10 - 16:26
 */
public class IdUtils
{
    public static String getId()
    {
        UUID uuid = UUID.randomUUID();
        String id = uuid.toString().replace("-","");
        return id;
    }
}
