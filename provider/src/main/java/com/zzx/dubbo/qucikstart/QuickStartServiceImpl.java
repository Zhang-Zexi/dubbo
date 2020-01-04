package com.zzx.dubbo.qucikstart;

import com.zzx.dubbo.ServiceAPI;

/**
 * @ClassName QuickStartServiceImpl
 * @Description
 * @Author zhangzx
 * @Date 2020/1/4 15:27
 * Version 1.0
 **/
public class QuickStartServiceImpl implements ServiceAPI {
    @Override
    public String sendMessage(String message) {
        return "quickstart-provider-message=" + message;
    }
}
