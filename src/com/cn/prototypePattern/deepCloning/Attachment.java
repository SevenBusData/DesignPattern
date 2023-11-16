package com.cn.prototypePattern.deepCloning;

import java.io.Serializable;

public class Attachment implements Serializable {
    void download(){
        System.out.println("下载附件");
    }
}
