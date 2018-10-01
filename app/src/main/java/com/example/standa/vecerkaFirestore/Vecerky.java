package com.example.standa.vecerkaFirestore;

import com.google.firebase.firestore.GeoPoint;

public class Vecerky {

   Double SundayOff ;
   Double WednesdayOn ;
   Double MondayOff  ;
   Double SaturdayOff ;
   Double FridayOn  ;
   Double FridayOff  ;
   GeoPoint Geopoint ;
   Double SaturdayOn  ;
   Boolean Card  ;
   String Name  ;
   Double SundayOn  ;
   Double WednesdayOff ;
   Double TuesdayOn  ;
   Double TuesdayOff  ;
   Double ThursdayOff ;
   Double ThursdayOn  ;
   Double MondayOn ;

    public Vecerky(Double sundayOff, Double wednesdayOn, Double mondayOff, Double saturdayOff, Double fridayOn, Double fridayOff, GeoPoint geopoint, Double saturdayOn, Boolean card, String name, Double sundayOn, Double wednesdayOff, Double tuesdayOn, Double tuesdayOff, Double thursdayOff, Double thursdayOn, Double mondayOn) {
        SundayOff = sundayOff;
        WednesdayOn = wednesdayOn;
        MondayOff = mondayOff;
        SaturdayOff = saturdayOff;
        FridayOn = fridayOn;
        FridayOff = fridayOff;
        Geopoint = geopoint;
        SaturdayOn = saturdayOn;
        Card = card;
        Name = name;
        SundayOn = sundayOn;
        WednesdayOff = wednesdayOff;
        TuesdayOn = tuesdayOn;
        TuesdayOff = tuesdayOff;
        ThursdayOff = thursdayOff;
        ThursdayOn = thursdayOn;
        MondayOn = mondayOn;
    }
    public Vecerky(){
    }
    public Double getSundayOff() {
        return SundayOff;
    }

    public void setSundayOff(Double sundayOff) {
        SundayOff = sundayOff;
    }

    public Double getWednesdayOn() {
        return WednesdayOn;
    }

    public void setWednesdayOn(Double wednesdayOn) {
        WednesdayOn = wednesdayOn;
    }

    public Double getMondayOff() {
        return MondayOff;
    }

    public void setMondayOff(Double mondayOff) {
        MondayOff = mondayOff;
    }

    public Double getSaturdayOff() {
        return SaturdayOff;
    }

    public void setSaturdayOff(Double saturdayOff) {
        SaturdayOff = saturdayOff;
    }

    public Double getFridayOn() {
        return FridayOn;
    }

    public void setFridayOn(Double fridayOn) {
        FridayOn = fridayOn;
    }

    public Double getFridayOff() {
        return FridayOff;
    }

    public void setFridayOff(Double fridayOff) {
        FridayOff = fridayOff;
    }

    public GeoPoint getGeopoint() {
        return Geopoint;
    }

    public void setGeopoint(GeoPoint geopoint) {
        Geopoint = geopoint;
    }

    public Double getSaturdayOn() {
        return SaturdayOn;
    }

    public void setSaturdayOn(Double saturdayOn) {
        SaturdayOn = saturdayOn;
    }

    public Boolean getCard() {
        return Card;
    }

    public void setCard(Boolean card) {
        Card = card;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSundayOn() {
        return SundayOn;
    }

    public void setSundayOn(Double sundayOn) {
        SundayOn = sundayOn;
    }

    public Double getWednesdayOff() {
        return WednesdayOff;
    }

    public void setWednesdayOff(Double wednesdayOff) {
        WednesdayOff = wednesdayOff;
    }

    public Double getTuesdayOn() {
        return TuesdayOn;
    }

    public void setTuesdayOn(Double tuesdayOn) {
        TuesdayOn = tuesdayOn;
    }

    public Double getTuesdayOff() {
        return TuesdayOff;
    }

    public void setTuesdayOff(Double tuesdayOff) {
        TuesdayOff = tuesdayOff;
    }

    public Double getThursdayOff() {
        return ThursdayOff;
    }

    public void setThursdayOff(Double thursdayOff) {
        ThursdayOff = thursdayOff;
    }

    public Double getThursdayOn() {
        return ThursdayOn;
    }

    public void setThursdayOn(Double thursdayOn) {
        ThursdayOn = thursdayOn;
    }

    public Double getMondayOn() {
        return MondayOn;
    }

    public void setMondayOn(Double mondayOn) {
        MondayOn = mondayOn;
    }
}
