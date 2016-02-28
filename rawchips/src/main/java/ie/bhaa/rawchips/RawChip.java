package ie.bhaa.rawchips;

import java.util.Date;

/**
 * Created by pauloconnell on 27/02/16.
 *
 * Id,Timing Point,Chip Code,Race No,Chip Time,Create Date,Can Use,Controller,Name,Event,Manual Time,Reader No,Ant No,Strength,Passing No,Hits
   916,Finish,213002450,2450,11:15:54,2016-02-20 11:15:17.163,True,192.168.1.159,Sarah Mulligan,2mile,False,1,2,-74,,0:00:00
 */
public class RawChip {

    Integer id;
    String timingPoint;
    Integer chipCode;
    Integer raceNo;
    String chipTime;
    String createDate;
    Boolean canUse;
    String controller;
    String name;
    String event;
    String manualTime;
    Integer readerNo;
    Integer antNo;
    String strength;
    String passingNo;
    String hits;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTimingPoint() {
        return timingPoint;
    }

    public void setTimingPoint(String timingPoint) {
        this.timingPoint = timingPoint;
    }

    public Integer getChipCode() {
        return chipCode;
    }

    public void setChipCode(Integer chipCode) {
        this.chipCode = chipCode;
    }

    public Integer getRaceNo() {
        return raceNo;
    }

    public void setRaceNo(Integer raceNo) {
        this.raceNo = raceNo;
    }

    public String getChipTime() {
        return chipTime;
    }

    public void setChipTime(String chipTime) {
        this.chipTime = chipTime;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Boolean getCanUse() {
        return canUse;
    }

    public void setCanUse(Boolean canUse) {
        this.canUse = canUse;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getManualTime() {
        return manualTime;
    }

    public void setManualTime(String manualTime) {
        this.manualTime = manualTime;
    }

    public Integer getReaderNo() {
        return readerNo;
    }

    public void setReaderNo(Integer readerNo) {
        this.readerNo = readerNo;
    }

    public Integer getAntNo() {
        return antNo;
    }

    public void setAntNo(Integer antNo) {
        this.antNo = antNo;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getPassingNo() {
        return passingNo;
    }

    public void setPassingNo(String passingNo) {
        this.passingNo = passingNo;
    }

    public String getHits() {
        return hits;
    }

    public void setHits(String hits) {
        this.hits = hits;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RawChip{");
        sb.append("id=").append(id);
        sb.append(", timingPoint='").append(timingPoint).append('\'');
        sb.append(", chipCode=").append(chipCode);
        sb.append(", raceNo=").append(raceNo);
        sb.append(", chipTime=").append(chipTime);
        sb.append(", createDate=").append(createDate);
        sb.append(", canUse=").append(canUse);
        sb.append(", controller='").append(controller).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", event='").append(event).append('\'');
        sb.append(", manualTime='").append(manualTime).append('\'');
        sb.append(", readerNo=").append(readerNo);
        sb.append(", antNo=").append(antNo);
        sb.append(", strength='").append(strength).append('\'');
        sb.append(", passingNo='").append(passingNo).append('\'');
        sb.append(", hits='").append(hits).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
