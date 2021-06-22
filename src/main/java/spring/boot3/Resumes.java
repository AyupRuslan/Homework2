package spring.boot3;
import java.time.LocalDate;

@lombok.Data
public class Resumes {
        private String id;                    //
        private String lastName;              //
        private String firstName;             //
        private String middleName;            //
        private long age;                     //
        private LocalDate birthDate;          //
        private BusinessTripReadiness gender; //
        private Area area;                    //
        private Metro metro;                    //
        private Relocation relocation;          //
        private BusinessTripReadiness businessTripReadiness;  //
        private Contact[] contact;                            //
        private Site[] site;                                //
        private String title;                               //
        private Photo photo;                                //
        private Photo[] portfolio;                      //
        private Specialization[] specialization;        //
        private Salary salary;                          //
        private BusinessTripReadiness[] employments;    //
        private BusinessTripReadiness[] schedules;      //
        private Education education;                    //
        private Language[] language;                    //
        private Experience[] experience;                //
        private TotalExperience totalExperience;        //
        private String skills;                          //
        private String[] skillSet;                      //
        private Area[] citizenship;                     //
        private Area[] workTicket;                      //
        private BusinessTripReadiness travelTime;       //
        private Recommendation[] recommendation;        //
        private BusinessTripReadiness resumeLocale;     //
        private Certificate[] certificate;              //
        private String alternateURL;                    //
        private String createdAt;                       //
        private String updatedAt;                       //
        private Download download;                      //
        private Actions actions;                        //
        private boolean hasVehicle;                     //
        private DriverLicenseType[] driverLicenseTypes; //
        private BusinessTripReadiness[] hiddenFields;   //
        private boolean marked;                         //
    }

@lombok.Data
    class Actions {
        private Download download;
    }

// Download.java
@lombok.Data
 class Download {
        private PDF pdf;
        private PDF rtf;
    }

// PDF.java
@lombok.Data
 class PDF {
        private String url;
    }

// Area.java
@lombok.Data
class Area {
        private String url;
        private String id;
        private String name;
    }

// BusinessTripReadiness.java
@lombok.Data
class BusinessTripReadiness {
        private String id;
        private String name;
    }

// Certificate.java
@lombok.Data
class Certificate {
        private String title;
        private LocalDate achievedAt;
        private String type;
        private String owner;
        private String url;
    }

// Contact.java
@lombok.Data
class Contact {
        private Boolean verified;
        private String comment;
        private BusinessTripReadiness type;
        private boolean preferred;
        private ValueUnion value;
    }

// ValueUnion.java
@lombok.Data
class ValueUnion {
        public ValueClass valueClassValue;
        public String stringValue;
    }

// ValueClass.java
@lombok.Data
class ValueClass {
        private String country;
        private String city;
        private String number;
        private String formatted;
    }

// DriverLicenseType.java
@lombok.Data
 class DriverLicenseType {
        private String id;
    }

// Education.java
@lombok.Data
class Education {
        private Elementary[] elementary;
        private Additional[] additional;
        private Additional[] attestation;
        private Primary[] primary;
        private BusinessTripReadiness level;
    }

// Additional.java
@lombok.Data
class Additional {
        private String name;
        private String organization;
        private String result;
        private long year;
    }

// Elementary.java
@lombok.Data
class Elementary {
        private String name;
        private long year;
    }

// Primary.java
@lombok.Data
class Primary {
        private String name;
        private String nameID;
        private String organization;
        private String organizationID;
        private String result;
        private Object resultID;
        private long year;
    }

// Experience.java
@lombok.Data
class Experience {
        private String company;
        private String companyID;
        private Area area;
        private String companyURL;
        private BusinessTripReadiness[] industries;
        private String position;
        private LocalDate start;
        private LocalDate end;
        private String description;
    }

// Language.java
@lombok.Data
class Language {
        private String id;
        private String name;
        private BusinessTripReadiness level;
    }

// Metro.java
@lombok.Data
class Metro {
        private double lat;
        private double lng;
        private long order;
        private String id;
        private String name;
    }

// Photo.java
@lombok.Data
class Photo {
        private String small;
        private String medium;
        private String id;
        private String description;
    }

// Recommendation.java
@lombok.Data
class Recommendation {
        private String name;
        private String position;
        private String organization;
    }

// Relocation.java
@lombok.Data
class Relocation {
        private BusinessTripReadiness type;
        private Area[] area;
    }

// Salary.java
@lombok.Data
class Salary {
        private long amount;
        private String currency;
    }

// Site.java
@lombok.Data
class Site {
        private String url;
        private BusinessTripReadiness type;
    }

// Specialization.java
@lombok.Data
class Specialization {
        private String id;
        private String name;
        private String profareaID;
        private String profareaName;
        private boolean laboring;
    }

// TotalExperience.java
@lombok.Data
class TotalExperience {
    private int months;
}
