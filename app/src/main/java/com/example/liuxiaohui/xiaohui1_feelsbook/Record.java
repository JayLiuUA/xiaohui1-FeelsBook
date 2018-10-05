package com.example.liuxiaohui.xiaohui1_feelsbook;

public class Record {
    protected String emotionName;
    protected String date;
    protected String comment;

    Record(String name, String comment, String date){
        this.emotionName = name;
        // if no comment is given, set comment to a empty space
        if (comment == null) {
            this.comment = "";
        } else {
            this.comment = comment;
        }
        setDate(date);
    }

    public String getEmotionName(){
        return this.emotionName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate(){
        return this.date;
    }

    public void setComment(String inputComment) {
        this.comment = inputComment;
    }

    public String toStringWithouComment(){
        return this.date.toString() + " | " + this.emotionName + " | " + this.comment;
    }

    public String toStringWithComment() {
        return this.date.toString() + " | " + this.emotionName + " | " + this.comment + "\n";
    }
}
