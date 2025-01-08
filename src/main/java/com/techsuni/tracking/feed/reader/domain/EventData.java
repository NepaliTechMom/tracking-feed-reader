package com.techsuni.tracking.feed.reader.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class EventData {

    private String trackingNo;
    private Timestamp eventDateAndTime;
    private String eventStatus;
    private String city;
    private String state;
    private Integer eventZip;

}
