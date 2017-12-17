package com.example.hibar.moblieproject.Models;

/**
 * Created by Hibar on 16/12/2560.
 */

public class FarkyTalkTalkModel {
        public String response;
        public String id;
        public int result;
        public String msg;

        public FarkyTalkTalkModel(String response, String id,int result, String msg){
                this.response = response;
                this.id = id;
                this.result = result;
                this.msg = msg;
        }

        public  FarkyTalkTalkModel(){
        }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
