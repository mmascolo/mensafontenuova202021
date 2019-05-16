package com.mminf.mensafontenuova;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * Created by Belal on 18/09/16.
 */


public class Menu1 extends Fragment {
    ArrayList<Elem> myList;

    ListView lv;
    AdapterA adapterA;
    AdapterB adapterB;
    boolean running = false;
    Thread thread;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments


        View v = inflater.inflate(R.layout.fragment_menu_2, container, false);

        lv = (ListView) v.findViewById(R.id.rsspertini);

        myList = new ArrayList<Elem>();

        adapterA = new AdapterA(this, myList);
        adapterB = new AdapterB(this, myList);




/*


        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                try  {

                    RssParser parser;
                    parser = new RssParser("https://www.icsandropertinifontenuova.edu.it/rss.xml");
                    Log.i("LOG", "Description: " + parser.getItem(3).description); //4th item's description








                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
*/
        return v;


    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Rss");
    }
}