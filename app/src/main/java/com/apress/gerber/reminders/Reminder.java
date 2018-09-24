package com.apress.gerber.reminders;

public class Reminder {


    private int mId;
    private String mContent;
    private int mImportant;

    public Reminder(int id, String content, int important) {
        mId = id;
        mImportant = important;
        mContent = content;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }
    public int getmImportant() {
        return mImportant;
    }

    public void setmImportant(int mImportant) {
        this.mImportant = mImportant;
    }


}

