package io.bitmax.api.rest.messages.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenOrdersList {

    @JsonProperty("code")
    private int code;

    @JsonProperty("status")
    private String status;

    @JsonProperty("email")
    private String email;

    @JsonProperty("data")
    private OpenOrder[] data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public OpenOrder[] getData() {
        return data;
    }

    public void setData(OpenOrder[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nOpenOrdersList:\n\tcode: " + code + '\n' +
                "\tstatus: " + status + '\n' +
                "\temail: " + email + '\n' +
                "\tdata: " + Arrays.toString(data);
    }
}
