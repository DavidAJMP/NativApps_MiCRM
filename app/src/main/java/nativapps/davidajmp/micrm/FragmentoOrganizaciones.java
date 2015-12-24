package nativapps.davidajmp.micrm;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Fragmento para la sección "Organizaciones"
 */

public class FragmentoOrganizaciones extends Fragment {

    private LinearLayoutManager linearLayout;

    public FragmentoOrganizaciones() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_organizaciones, container, false);

        //Instanciación de los elementos del fragmento
        Button botn_orga = (Button)view.findViewById(R.id.botn_orga);
        final EditText nomb_orga = (EditText)view.findViewById(R.id.nomb_orga);
        final EditText direc_orga = (EditText)view.findViewById(R.id.direc_orga);
        final EditText tele_orga = (EditText)view.findViewById(R.id.tele_orga);

        //Se añade el placeholder para cada campo de la interfaz
        EditText editText[] = {nomb_orga, direc_orga, tele_orga};

        for (EditText anEditText : editText) {
            ActividadPrincipal.addPlaceholder(anEditText);
        }

        //Evento de escucha para el botón del fragmento que reestablece las cajas de texto
        botn_orga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomb_orga.setText(R.string.tag_name);
                direc_orga.setText(R.string.tag_addrs);
                tele_orga.setText(R.string.tag_phone);

                //Notificación toast para la acción del botón
                Toast.makeText(getActivity(), R.string.tag_toast_companies, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }


}
