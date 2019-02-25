package com.galva.addressbook;

import com.google.gson.annotations.SerializedName;

public class Books {
    @SerializedName("firstname") private String Name;
    @SerializedName("work") private String Work;
    @SerializedName("email") private String Email;

    public String getName() {
        return Name;
    }

    public String getWork() {
        return Work;
    }

    public String getEmail() {
        return Email;
    }
}
