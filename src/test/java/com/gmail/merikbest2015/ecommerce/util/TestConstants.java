package com.gmail.merikbest2015.ecommerce.util;

public class TestConstants {

    public static final String URL_ADMIN_BASIC = "/api/v1/admin";
    public static final String URL_ADMIN_ADD = "/api/v1/admin/add";
    public static final String URL_ADMIN_GET_USER = "/api/v1/admin/user/";
    public static final String URL_AUTH_BASIC = "/api/v1/auth";
    public static final String URL_AUTH_LOGIN = "/api/v1/auth/login";
    public static final String URL_AUTH_FORGOT = "/api/v1/auth/forgot";
    public static final String URL_AUTH_RESET = "/api/v1/auth/reset";
    public static final String URL_PERFUMES_BASIC = "/api/v1/perfumes";
    public static final String URL_PERFUMES_SEARCH = "/api/v1/perfumes/search";
    public static final String URL_PERFUMES_GRAPHQL = "/api/v1/perfumes/graphql";
    public static final String URL_REGISTRATION_BASIC = "/api/v1/registration";
    public static final String URL_REGISTRATION_ACTIVATE = "/api/v1/registration/activate/{code}";
    public static final String URL_USERS_BASIC = "/api/v1/users";
    public static final String URL_USERS_ORDER = "/api/v1/users/order";
    public static final String URL_USERS_REVIEW = "/api/v1/users/review";

    public static final Integer USER_ID = 122;
    public static final String USER_EMAIL = "test123@test.com";
    public static final String USER_PASSWORD = "admin";
    public static final String ROLE_USER = "USER";

    public static final String USER_PASSWORD_RESET_CODE = "3f9bcdb0-2241-4c34-803e-598b497d571f";
    public static final String USER_ACTIVATION_CODE = "8e97dc37-2cf5-47e2-98e0";

    public static final Integer USER2_ID = 126;
    public static final String USER2_EMAIL = "helloworld@test.com";
    public static final String USER2_NAME = "John2";

    public static final String EMAIL_FAILURE = "1t2e3st123@test.com";
    public static final String ADMIN_EMAIL = "admin@gmail.com";
    public static final String ROLE_ADMIN = "ADMIN";

    public static final Double TOTAL_PRICE = 56.0;
    public static final String FIRST_NAME = "John";
    public static final String LAST_NAME = "Doe";
    public static final String CITY = "New York";
    public static final String ADDRESS = "Wall street 1";
    public static final String ORDER_EMAIL = "test123@test.com";
    public static final String PHONE_NUMBER = "12345678";
    public static final Integer POST_INDEX = 123456;

    public static final String PERFUMER_CREED = "Creed";
    public static final String PERFUMER_CHANEL = "Chanel";
    public static final String PERFUME_TITLE = "Chanel N5";
    public static final Integer YEAR = 1921;
    public static final String COUNTRY = "France";
    public static final String PERFUME_GENDER = "female";
    public static final String FRAGRANCE_TOP_NOTES = "Aldehydes, Bergamot, Neroli";
    public static final String FRAGRANCE_MIDDLE_NOTES = "Iris, Grasse jasmine";
    public static final String FRAGRANCE_BASE_NOTES = "Amber, Sandalwood, Vanilla";
    public static final Integer PRICE = 192;
    public static final String VOLUME = "200";
    public static final String TYPE = "Eau de parfum";

    public static final String FILE_NAME = "Chanel N5.jpg";
    public static final String FILE_PATH = "C:/Users/merik/IdeaProjects/ecommerce-spring-reactjs/src/main/resources/uploads/empty.jpg";

    public static final String GRAPHQL_QUERY_PERFUMES = "" +
            "{\n" +
            "    perfumes {\n" +
            "        id\n" +
            "        perfumeTitle\n" +
            "        perfumer\n" +
            "        price\n" +
            "        filename\n" +
            "    }\n" +
            "}";

    public static final String GRAPHQL_QUERY_PERFUME = "" +
            "{\n" +
            "    perfume(id: 2) {\n" +
            "        id\n" +
            "        perfumeTitle\n" +
            "        perfumer\n" +
            "        price\n" +
            "    }\n" +
            "}";
}
