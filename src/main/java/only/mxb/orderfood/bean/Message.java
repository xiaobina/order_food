package only.mxb.orderfood.bean;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Isalo
 * @create 2020-03-22:42
 */
@Component
public class Message {
    /**
     * {
     * "status" : 0 ,          //执行状态码
     * "msg"    : "SUCCESS",   //说明文字信息，没有为NULL
     * "data"   :
     * [
     * {            //对象中嵌套数组，数组是返回的数据，
     * "id"    : 1 ,
     * "name"  : "xiaohong"
     * },
     * {
     * "id"    : 2,
     * "name"  : "xiaoming"
     * }
     * ]
     * }
     */
    private Integer status;
    private String msg;
    private List<Object> data;

    public Message() {
    }

    public Message(Integer status, String msg, List<Object> data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}