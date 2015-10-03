package hackathon.london.tearfunddisasterresponse;

import android.graphics.Bitmap;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sam on 03/10/15.
 */
public class ItemReport {

    private String phoneNumber = null;
    private String category = null;
    private String location = null;
    private Bitmap picture = null;
    private HashMap<String, String> answers = new HashMap<>();
    private String notes = null;
    private Date timestamp = null;

    private final static String PHONE_NUMBER_NAME = "phoneNumber";
    private final static String CATEGORY_NAME = "category";
    private final static String LOCATION_NAME = "location";
    private final static String PICTURE_URL_NAME = "pictureUrl";
    private final static String NOTES_NAME = "notes";

    private static final String PICTURE_URL_PREFIX = "http://www.example.com/path/";


    public ItemReport() {

    }

    public ItemReport(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Bitmap getPicture() {
        return this.picture;
    }

    public void setPicture(Bitmap picture) {
        this.picture = picture;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getAnswer(String question) {
        return this.answers.get(question);
    }

    public void answerQuestion(String question, String answer) {
        this.answers.put(question, answer);
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Map<String, String> generateMap() {
        Map<String, String> reportMap = new HashMap<>(5);
        reportMap.put(CATEGORY_NAME, getCategory());
        reportMap.put(LOCATION_NAME, getLocation());
        reportMap.put(PHONE_NUMBER_NAME, getPhoneNumber());
        reportMap.put(PICTURE_URL_NAME, getPictureUrl());
        reportMap.put(NOTES_NAME, getNotes());

        return reportMap;
    }

    private String getPictureUrl() {
        return PICTURE_URL_PREFIX + getTimestamp().getTime();
    }


}
