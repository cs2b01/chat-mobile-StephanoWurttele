package cs2901.utec.chat_mobile;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        Intent nombre = getIntent();
        TextView contactsActivityTitle = (TextView)findViewById(R.id.contactsActivityTitle);
        String username = nombre.getStringExtra("username");
        String title = username+"'s contacts";
        contactsActivityTitle.setText(title);
    }
}
