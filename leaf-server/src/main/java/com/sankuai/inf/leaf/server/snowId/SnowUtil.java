package com.sankuai.inf.leaf.server.snowId;

public class SnowUtil {

    private static SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker(0, 1, 0);

    public static long getId(){
        return snowflakeIdWorker.nextId();
    }

}



