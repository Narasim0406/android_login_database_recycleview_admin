package com.example.narasim.jm_solution_admin;


/**
 * Created by NAVA-PC on 6/6/2016.
 */
public class Config {

    //Link ke database
    public static final String URL_ADD="http://arunraaza.com/android/android/addEmp.php";
    public static final String URL_GET_ALL = "http://arunraaza.com/android/android/getAllEmp.php?username=narasimprime";

    public static final String URL_GET_PRODUCT = "http://arunraaza.com/android/android/admin/getProduct.php?id=";
    public static final String URL_GET_SERVICE = "http://arunraaza.com/android/android/admin/getService.php?id=";

    public static final String URL_GET_PRODUCT_FEED = "http://arunraaza.com/android/android/admin/getFeedProduct.php?id=";
    public static final String URL_GET_SERVICE_FEED = "http://arunraaza.com/android/android/admin/getFeedService.php?id=";

    public static final String URL_GET_EMP = "http://arunraaza.com/android/android/getService.php?id=";
//admin


    public static final String URL_UPDATE_PRODUCT_STATUS = "http://arunraaza.com/android/android/admin/updateProductStatus.php";
    public static final String URL_UPDATE_SERVICE_STATUS = "http://arunraaza.com/android/android/admin/updateServiceStatus.php";

    public static final String URL_UPDATE_PRODUCT_REPLY = "http://arunraaza.com/android/android/admin/updateProductReply.php";
    public static final String URL_UPDATE_SERVICE_REPLY = "http://arunraaza.com/android/android/admin/updateServiceReply.php";


//admin
//    public static final String URL_UPDATE_PRODUCT_FEED = "http://arunraaza.com/android/android/admin/updateProductFeed.php";
//    public static final String URL_UPDATE_SERVICE_FEED = "http://arunraaza.com/android/android/admin/updateServiceFeed.php";


    public static final String URL_DELETE_EMP = "http://arunraaza.com/android/android/deleteEmp.php?id=";
    public static final String URL_SELECT_EMP = "http://arunraaza.com/android/android/selectEmp.php?id=";


    public static final String URL_ADD_USERS="http://arunraaza.com/android/android/users/addUsers.php";
    public static final String URL_GET_ALL_USERS = "http://arunraaza.com/android/android/users/getAllUsers.php";
    public static final String URL_GET_USERS = "http://arunraaza.com/android/android/users/getUsers.php?id=";
    public static final String URL_UPDATE_USERS = "http://arunraaza.com/android/android/users/updateUsers.php";
    public static final String URL_DELETE_USERS = "http://arunraaza.com/android/android/users/deleteUsers.php?id=";

    //Kunci yang akan digunakan untuk mengirim permintaan ke php script
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAME = "name";
    public static final String KEY_EMP_DESG = "desg";
    public static final String KEY_EMP_SAL = "salary";
    public static final String KEY_EMP_MOB = "mobile";
    public static final String KEY_EMP_MODEL = "model";
    public static final String KEY_EMP_USERNAME = "username";
    public static final String KEY_EMP_PASSWORD = "password";
    public static final String KEY_EMP_FEED = "feed";
    public static final String KEY_EMP_REPLY = "reply";
    public static final String KEY_EMP_STATUS = "status";
    public static final String KEY_EMP_HINT = "hint";

    //Kunci yang akan digunakan untuk mengirim permintaan ke php script
    public static final String KEY_EMP_ID_USERS = "id";
    public static final String KEY_EMP_NAME_USERS = "name";
    public static final String KEY_EMP_USERNAME_USERS = "username";
    public static final String KEY_EMP_PASSWORD_USERS = "password";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "name";
    public static final String TAG_PRODUCT = "product";
    public static final String TAG_MODEL = "model";
    public static final String TAG_QUANTITY = "quantity";
    public static final String TAG_DEL_DATE = "deldate";
    public static final String TAG_CON_NAME = "con_name";
    public static final String TAG_MOBILE = "mobile";
    public static final String TAG_STATUS = "status";
    public static final String TAG_TOKEN = "token";
    public static final String TAG_TOKENNAME = "tokenname";
    public static final String TAG_SERVICE = "service";
    public static final String TAG_BOOK_DATE = "bookdate";
    public static final String TAG_FEED = "feed";
    public static final String TAG_HINT = "hint";
    public static final String TAG_REPLY = "reply";


    //JSON Tags
    public static final String TAG_JSON_ARRAY_USERS="result";
    public static final String TAG_ID_USERS = "id";
    public static final String TAG_NAME_USERS = "name";
    public static final String TAG_USERNAME_USERS = "username";
    public static final String TAG_PASSWORD_USERS= "password";

    //id karyawan untuk lulus dengan maksud
    public static final String EMP_ID = "emp_id";
    public static final String USERS_ID = "users_id";
}
