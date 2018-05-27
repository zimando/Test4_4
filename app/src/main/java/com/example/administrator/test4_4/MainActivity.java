package com.example.administrator.test4_4;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.ContextMenu;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.app.ListActivity;
        import android.os.Bundle;
        import android.view.ContextMenu;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.ContextMenu.ContextMenuInfo;
        import android.view.View;
        import android.widget.AdapterView.AdapterContextMenuInfo;
        import android.widget.ArrayAdapter;
        import android.util.Log;

public class MainActivity extends ListActivity {

    private ListView lv;
    private String[] menuStrs;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initListView();
        ListView lv= getListView();
        registerForContextMenu(lv);

    }
    private  void initListView()
    {

        menuStrs = new String[] { "第一行", "第二行", "第三行", "第四行" };
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, menuStrs);
        //lv.setAdapter(adapter);
        MainActivity.this.setListAdapter(adapter);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        //menu.setHeaderTitle("select");
        //if (v == tv)
        {
            menu.add(0, 0, 0, "菜单第一行");
            menu.add(0, 1, 1, "菜单第二行");
            menu.add(0, 2, 2, "菜单第三行");
            menu.add(0, 3, 3, "菜单第四行");
        }
    }


}
