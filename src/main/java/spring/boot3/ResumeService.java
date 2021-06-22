package spring.boot3;

import java.time.LocalDate;

public class ResumeService {
    public Resumes getResume(){
        Resumes resume =new Resumes();

        resume.setId("12345678901234567890123456789012abcdef");
        resume.setLastName("Петров");
        resume.setFirstName("Владимир");
        resume.setMiddleName("Олегович");
        resume.setAge(25);
        resume.setBirthDate(LocalDate.of(1996,5,11));

        BusinessTripReadiness business =new BusinessTripReadiness();
        business.setId("male");
        business.setName("Мужской");
        resume.setGender(business);

        Area area =new Area();
        area.setId("1");
        area.setUrl("https://api.hh.ru/areas/1");
        area.setName("Москва");
        resume.setArea(area);

        Metro metro =new Metro();
        metro.setLat(55.658147);
        metro.setLng(37.540957);
        metro.setOrder(19);
        metro.setId("6.47");
        metro.setName("Калужская");
        resume.setMetro(metro);

        business.setId("relocation_possible");
        business.setName("готов к переезду");
        area.setUrl("https://api.hh.ru/areas/2");
        area.setId("2");
        area.setName("Санкт-Петербург");
        Area area1 =new Area();
        area1.setUrl("https://api.hh.ru/areas/76");
        area1.setId("76");
        area1.setName("Ростов-на-Дону");
        Relocation relocation =new Relocation();
        relocation.setArea(new Area[]{area,area1});
        relocation.setType(business);

        business.setId("ready");
        business.setName("Готов к командировкам");
        resume.setBusinessTripReadiness(business);

        Contact contact1 =new Contact();
        contact1.setComment("");
        contact1.setPreferred(true);
        contact1.setVerified(true);
        ValueUnion valueUnion=new ValueUnion();
        ValueClass valueClass=new ValueClass();
        valueClass.setCountry("7");
        valueClass.setCity("123");
        valueClass.setNumber("4567890");
        valueClass.setFormatted("+71234567890");
        valueUnion.setValueClassValue(valueClass);
        BusinessTripReadiness bus =new BusinessTripReadiness();
        bus.setId("cell");
        bus.setName("Мобильный телефон");
        contact1.setType(bus);
        contact1.setValue(valueUnion);

        Contact contact2 =new Contact();
        contact2.setPreferred(false);
        ValueUnion valueUnion2=new ValueUnion();
        valueUnion2.setStringValue("applicant@example.com");
        BusinessTripReadiness bus2 =new BusinessTripReadiness();
        bus2.setId("email");
        bus2.setName("Эл. почта");
        contact2.setType(bus);
        contact2.setValue(valueUnion2);

        resume.setContact(new Contact[]{contact1,contact2});

        Site site1 =new Site();
        site1.setUrl("echo123");
        bus.setId("skype");
        bus.setName("Skype");
        site1.setType(bus);
        Site site2 =new Site();
        site2.setUrl("123456");
        bus2.setId("icq");
        bus2.setName("ICQ");
        site2.setType(bus2);
        resume.setSite(new Site[]{site1,site2});
        resume.setTitle("Программист Python");

        Photo photo =new Photo();
        photo.setSmall("https://hh.ru/...");
        photo.setMedium("https://hh.ru/...");
        photo.setId("1337");
        resume.setPhoto(photo);

        Photo photo1=new Photo();
        photo1.setSmall("https://hh.ru/...");
        photo1.setMedium("https://hh.ru/...");
        photo1.setId("1337");
        photo1.setDescription("...");
        resume.setPortfolio(new Photo[]{photo1});

        Specialization spec1 =new Specialization();
        spec1.setId("1.221");
        spec1.setName("Программирование, Разработка");
        spec1.setProfareaID("1");
        spec1.setProfareaName("Информационные технологии, интернет, телеком");
        spec1.setLaboring(false);
        Specialization spec2 =new Specialization();
        spec2.setId("1.89");
        spec2.setName("Интернет");
        spec2.setProfareaID("1");
        spec2.setProfareaName("Информационные технологии, интернет, телеком");
        spec2.setLaboring(false);
        Specialization spec3 =new Specialization();
        spec3.setId("1.9");
        spec3.setName("Web инженер");
        spec3.setProfareaID("1");
        spec3.setProfareaName("Информационные технологии, интернет, телеком");
        spec3.setLaboring(false);
        resume.setSpecialization(new Specialization[]{spec1,spec2,spec3});

        Salary salary=new Salary();
        salary.setAmount(100500);
        salary.setCurrency("RUR");
        resume.setSalary(salary);

        BusinessTripReadiness bis1 =new BusinessTripReadiness();
        BusinessTripReadiness bis2 =new BusinessTripReadiness();
        bis1.setId("full");
        bis1.setName("Полная занятость");
        bis2.setId("part");
        bis2.setName("Частичная занятость");
        resume.setEmployments(new BusinessTripReadiness[]{bis1,bis2});

        bis1.setId("fullDay");
        bis1.setName("Полный день");
        bis2.setId("flexible");
        bis2.setName("Гибкий график");
        resume.setSchedules(new BusinessTripReadiness[]{bis1,bis2});

        Elementary elementary =new Elementary();
        elementary.setName("Школа №1923");
        elementary.setYear(2003);
        Additional additional =new Additional();
        additional.setName("Курс повышения квалификации");
        additional.setOrganization("Проводившая организация");
        additional.setResult("Специализация");
        additional.setYear(2006);
        Additional additional1=new Additional();
        additional1.setName("Тест на IQ");
        additional1.setOrganization("IQ центр");
        additional1.setResult("Интеллект квалификейшн");
        additional1.setYear(2005);
        Primary primary=new Primary();
        primary.setName("Московская государственная академия ветеринарной медицины и биотехнологии имени К.И. Скрябина, Москва");
        primary.setNameID("39464");
        primary.setOrganization("Факультет зоотехнологий и агробизнеса");
        primary.setOrganizationID("25181");
        primary.setResult("Социальная психология");
        primary.setResultID(null);
        primary.setYear(2000);
        BusinessTripReadiness business3=new BusinessTripReadiness();
        business3.setId("higher");
        business3.setName("Высшее");
        Education education =new Education();
        education.setElementary(new Elementary[]{elementary});
        education.setAdditional(new Additional[]{additional});
        education.setAttestation(new Additional[]{additional1});
        education.setPrimary(new Primary[]{primary});
        education.setLevel(business3);

        BusinessTripReadiness business4 =new BusinessTripReadiness();
        business4.setId("native");
        business4.setName("родной");
        Language language1 =new Language();
        language1.setId("rus");
        language1.setLevel(business4);
        language1.setName("Русский");
        BusinessTripReadiness business5 =new BusinessTripReadiness();
        business4.setId("b2");
        business4.setName("B2 — Средне-продвинутый");
        Language language2 =new Language();
        language2.setId("eng");
        language2.setLevel(business4);
        language2.setName("Английский");
        resume.setLanguage(new Language[]{language1,language2});

        Experience experience =new Experience();
        experience.setCompany("Название работодателя");
        experience.setCompanyID("");
        experience.setCompanyURL("http://www.rbc.ru");
        experience.setPosition("Должность");
        experience.setStart(LocalDate.of(2005, 04, 01));
        experience.setEnd(LocalDate.of(2013, 01, 01));
        experience.setDescription("Описание деятельности в компании");
        Area area2=new Area();
        area2.setUrl("https://api.hh.ru/areas/113");
        area2.setId("113");
        area2.setName("Россия");
        experience.setArea(area2);
        BusinessTripReadiness business6=new BusinessTripReadiness();
        BusinessTripReadiness business7=new BusinessTripReadiness();
        business6.setId("7.540");
        business6.setName("Разработка программного обеспечения");
        business7.setId("9.399");
        business7.setName("Мобильная связь");
        experience.setIndustries(new BusinessTripReadiness[]{business6,business7});
        resume.setExperience(new Experience[]{experience});

        TotalExperience totalExperience=new TotalExperience();
        totalExperience.setMonths(94);
        resume.setTotalExperience(totalExperience);

        resume.setSkills("Дополнительная информация: ключевые навыки");
        resume.setSkillSet(new String[]{"HTML", "CSS"});

        Area area3 =new Area();
        area3.setUrl("https://api.hh.ru/areas/113");
        area3.setId("113");
        area3.setName("Россия");
        resume.setCitizenship(new Area[]{area3});

        Area area4=new Area();
        area4.setUrl("https://api.hh.ru/areas/113");
        area4.setId("113");
        area4.setName("Россия");
        resume.setWorkTicket(new Area[]{area4});

        BusinessTripReadiness business8 =new BusinessTripReadiness();
        business8.setId("any");
        business8.setName("Не имеет значения");
        resume.setTravelTime(business8);

        Recommendation recommendation=new Recommendation();
        recommendation.setName("Петров Петр");
        recommendation.setPosition("старший научный сотрудник");
        recommendation.setOrganization("Роскосмос");
        resume.setRecommendation(new Recommendation[]{recommendation});

        BusinessTripReadiness business9 =new BusinessTripReadiness();
        business9.setId("RU");
        business9.setName("Русский");
        resume.setResumeLocale(business9);

        Certificate certificate1=new Certificate();
        certificate1.setTitle("Oracle Certified Java Professional Programmer");
        certificate1.setAchievedAt(LocalDate.of(2013, 01,01));
        certificate1.setType("custom");
        certificate1.setOwner(null);
        certificate1.setUrl("https://example.com/certificate/123456");
        Certificate certificate2=new Certificate();
        certificate2.setTitle("MCSE: Windows NT 4.0");
        certificate2.setAchievedAt(LocalDate.of(1998,01,26));
        certificate2.setType("microsoft");
        certificate2.setOwner("JOHN DOE");
        certificate2.setUrl(null);
        resume.setCertificate(new Certificate[]{certificate1,certificate2});

        resume.setAlternateURL("https://hh.ru/resume/12345678901234567890123456789012abcdef");
        resume.setCreatedAt("2013-05-31T14:27:04+0400");
        resume.setUpdatedAt("2013-10-17T15:22:55+0400");

        Download download =new Download();
        PDF pdf=new PDF();
        pdf.setUrl("https://hh.ru/api_resume_converter/12345678901234567890123456789012abcdef/ФамилияИмяОтчество.pdf?type=pdf");
        PDF rtf =new PDF();
        rtf.setUrl("https://hh.ru/api_resume_converter/12345678901234567890123456789012abcdef/ФамилияИмяОтчество.rtf?type=rtf");
        download.setPdf(pdf);
        download.setRtf(rtf);
        resume.setDownload(download);
        Actions actions=new Actions();
        actions.setDownload(download);
        resume.setActions(actions);

        resume.setHasVehicle(true);
        DriverLicenseType driverLicenseType1=new DriverLicenseType();
        driverLicenseType1.setId("A");
        DriverLicenseType driverLicenseType2=new DriverLicenseType();
        driverLicenseType2.setId("B");
        resume.setDriverLicenseTypes(new DriverLicenseType[]{driverLicenseType1,driverLicenseType2});

        BusinessTripReadiness business10 =new BusinessTripReadiness();
        business10.setId("phones");
        business10.setName("Все указанные в резюме телефоны");
        resume.setHiddenFields(new BusinessTripReadiness[]{business10});
        resume.setMarked(true);

        return resume;







    }

}
