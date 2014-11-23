package com.example.sam.paypalattempt;
        import java.net.HttpURLConnection;

        import com.android.volley.Cache;
        import com.android.volley.RequestQueue;
        import com.android.volley.Response;
        import com.android.volley.VolleyError;
        import com.android.volley.toolbox.BasicNetwork;
        import com.android.volley.toolbox.DiskBasedCache;
        import com.android.volley.toolbox.HurlStack;
        import com.android.volley.toolbox.JsonObjectRequest;
        import com.android.volley.toolbox.JsonArrayRequest;
        import com.android.volley.toolbox.Volley;
        import com.squareup.okhttp.OkHttpClient;
        import com.squareup.okhttp.Request;
        import java.io.IOException;

        import org.apache.http.NameValuePair;
        import org.apache.http.auth.Credentials;
        import org.apache.http.auth.UsernamePasswordCredentials;
        import org.apache.http.client.ClientProtocolException;
        import org.apache.http.client.entity.UrlEncodedFormEntity;
        import org.apache.http.client.methods.HttpPost;
        import java.net.URI;
        import java.net.HttpURLConnection;
        import org.apache.http.client.HttpClient;
        import org.apache.http.client.methods.HttpGet;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import org.apache.http.client.HttpResponseException;
        import org.apache.http.HttpResponse;
        import com.paypal.android.sdk.payments.PayPalAuthorization;
        import com.paypal.android.sdk.payments.PayPalConfiguration;

        import android.app.DownloadManager;
        import android.net.Network;
        import android.widget.LinearLayout;
        import android.widget.TextView;
        import com.parse.Parse;
        import com.parse.ParseObject;
        import com.parse.ParseUser;
        import com.parse.SignUpCallback;
        import com.parse.ParseException;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;
        import com.paypal.android.sdk.payments.PayPalFuturePaymentActivity;
        import com.paypal.android.sdk.payments.PayPalItem;
        import com.paypal.android.sdk.payments.PayPalOAuthScopes;
        import com.paypal.android.sdk.payments.PayPalPayment;
        import com.paypal.android.sdk.payments.PayPalPaymentDetails;
        import com.paypal.android.sdk.payments.PayPalProfileSharingActivity;
        import com.paypal.android.sdk.payments.PayPalService;
        import com.paypal.android.sdk.payments.PaymentActivity;
        import com.paypal.android.sdk.payments.PaymentConfirmation;
        import com.paypal.android.sdk.payments.ShippingAddress;

        import android.app.Activity;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Toast;

        import org.apache.http.client.HttpClient;
        import org.apache.http.client.methods.HttpGet;
        import org.apache.http.impl.client.DefaultHttpClient;
        import org.apache.http.message.BasicNameValuePair;
        import org.json.JSONArray;
        import org.json.JSONException;
        import org.json.JSONObject;

        import java.math.BigDecimal;

        import java.util.Arrays;
        import java.util.HashSet;
        import java.util.Set;
import com.paypal.android.sdk.payments.PayPalAuthorization;




import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;




public class MainActivity extends Activity {
    // Can be NO_NETWORK for OFFLINE, SANDBOX for TESTING and LIVE for PRODUCTION
    private static final String CONFIG_ENVIRONMENT = PayPalConfiguration.ENVIRONMENT_SANDBOX;
    // note that these credentials will differ between live & sandbox environments.
    private static final String CONFIG_CLIENT_ID = "AafrMBCZ2iGuAOiJoEdGWm--ux6PlULsdL-DzTPX9Vd1jeCIqCGzcQASd4VQ";
    // when testing in sandbox, this is likely the -facilitator email address.
    //private static final String CONFIG_RECEIVER_EMAIL = "edwinwu16-facilitator@gmail.com";
    private static final String CONFIG_CLIENT_SECRET = "ECZA3xBVpZhu4VdCrsp1u5pudDKt5ok3OvQLSPfoShRdqjrxmLDmF8y5k70w";
    public String AUTHORIZATION = "";

    private static PayPalConfiguration config = new PayPalConfiguration()
            .environment(CONFIG_ENVIRONMENT)
            .clientId(CONFIG_CLIENT_ID)
                    // The following are only used in PayPalFuturePaymentActivity.
            .merchantName("Hipster Store")
            .merchantPrivacyPolicyUri(Uri.parse("https://www.example.com/privacy"))
            .merchantUserAgreementUri(Uri.parse("https://www.example.com/legal"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, PayPalService.class);
        intent.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION, config);

        findtoken();
        String outputString = AUTHORIZATION;
        LinearLayout lView = new LinearLayout(this);

        TextView myText = new TextView(this);
        myText.setText(outputString);

        lView.addView(myText);

        setContentView(lView);
        //intent.putExtra(PayPalService.EXTRA_CLIENT_ID, CONFIG_CLIENT_ID);
        //intent.putExtra(PayPalService.EXTRA_RECEIVER_EMAIL, CONFIG_RECEIVER_EMAIL);
        startService(intent);
        Parse.initialize(this, "98jcsCv2OdkjMJbi8wuk1Fj2DjW76hZ2eLUHafnK", "jvchToHvHfUQ0A5Fk39weLOzwuaUr6SZ2bIvRtmf");
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }


    public void httpPostAttempt()
    {
        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost("https://api.zinc.io/v0/orderp");
        Credentials defaultcreds = new UsernamePasswordCredentials("AafrMBCZ2iGuAOiJoEdGWm--ux6PlULsdL-DzTPX9Vd1jeCIqCGzcQASd4VQ",
                "ECZA3xBVpZhu4VdCrsp1u5pudDKt5ok3OvQLSPfoShRdqjrxmLDmF8y5k70w");
        httpclient.getState().getCredentials
        try {
            // Add your data
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
            nameValuePairs.add(new BasicNameValuePair("user: ", "AafrMBCZ2iGuAOiJoEdGWm--ux6PlULsdL-DzTPX9Vd1jeCIqCGzcQASd4VQ"));
            nameValuePairs.add(new BasicNameValuePair("password: ", "ECZA3xBVpZhu4VdCrsp1u5pudDKt5ok3OvQLSPfoShRdqjrxmLDmF8y5k70w"));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

            // Execute HTTP Post Request
            HttpResponse response = httpclient.execute(httppost);

        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
        } catch (IOException e) {
            // TODO Auto-generated catch block
        }
    }
}

    public void signUp(String username, String password, String addressline1, String city, String zipCode, String state, String country, String wishlistID) {
        ParseUser newUser = new ParseUser();
        newUser.setUsername(username);
        newUser.setPassword(password);
        newUser.put("addressline1", addressline1);
        newUser.put("city", city);
        newUser.put("zipCode", zipCode);
        newUser.put("state", state);
        newUser.put("country", country);
        newUser.put("wishlistID", wishlistID);
        newUser.put("balance", 0);
        newUser.signUpInBackground();
    }

    public String getCurrentUserUsername() {
        ParseUser currentUser = ParseUser.getCurrentUser();
        String username = currentUser.getUsername();
        return username;
    }

    public double getCurrentUserBalance() {
        ParseUser currentUser = ParseUser.getCurrentUser();
        double balance = currentUser.getDouble("balance");
        return balance;
    }

    public boolean userSignedIn() {
        ParseUser currentUser = ParseUser.getCurrentUser();
        if (currentUser == null) {
            return false;
        } else {
            return true;
        }
    }

    public void findtoken(){

    RequestQueue mRequestQueue;

    Cache cache = new DiskBasedCache(getCacheDir(), 1024 * 1024);

    BasicNetwork network = new BasicNetwork(new HurlStack());

    mRequestQueue = new RequestQueue(cache, network);

    mRequestQueue.start();


    String url = "https://api.sandbox.paypal.com/v1/oauth2/token";

    String combinedUser = "username: " + CONFIG_CLIENT_ID;

    Object a = CONFIG_CLIENT_ID;
    Object b = CONFIG_CLIENT_SECRET;
    JSONObject params = new JSONObject();
    params.


    //note params may not be right

    JsonObjectRequest req = new JsonObjectRequest(com.android.volley.Request.Method.POST, url, params,

            new Response.Listener<JSONObject>(){
                @Override //idk
                public void onResponse(JSONObject response) {
                    if (response != null) {

                            try {
                                AUTHORIZATION = (response.get("access_token").toString());
                            } catch (JSONException e) {
                                e.getCause();
                            }
                        }
                    }




            },

            new Response.ErrorListener(){
                @Override
                public void onErrorResponse(VolleyError error){

                }


            }


            );

            mRequestQueue.add(req);
    }










                public String parseProductId(String productURL) {
        String productId = "";
        int productURLLength = productURL.length();
        int productIdLocation = 0;
        int i = 0;
        boolean inLoop = true;
        while(i < productURLLength && inLoop == true) {
            if (Character.toString(productURL.charAt(i)) == "p") {
                inLoop = false;
            }
            else {
                i++;
            }
        }
        productIdLocation = i + 2;
        for(int j = productIdLocation; j < productIdLocation + 10; j++) {
            productId += Character.toString(productURL.charAt(i));
        }
        return productId;
    }

 // public String makeFirstPayment(String dollarAmount) {
      //    final TextView mTextView = (TextView) findViewById(R.id.text);
  //}

    @Override
    public void onDestroy() {
        // Stop service when done
        stopService(new Intent(this, PayPalService.class));
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
