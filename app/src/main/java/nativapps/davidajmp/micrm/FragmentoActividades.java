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
 * Fragmento para la sección "Actividades"
 */

public class FragmentoActividades extends Fragment {

    private LinearLayoutManager linearLayout;

    public FragmentoActividades() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_actividades, container, false);

        //Instanciación de los elementos del fragmento
        Button botn_acti = (Button)view.findViewById(R.id.botn_acti);
        final EditText desc_acti = (EditText)view.findViewById(R.id.desc_acti);
        final EditText tipo_acti = (EditText)view.findViewById(R.id.tipo_acti);
        final EditText orga_acti = (EditText)view.findViewById(R.id.orga_acti);
        final EditText pers_acti = (EditText)view.findViewById(R.id.pers_acti);
        final EditText nego_acti = (EditText)view.findViewById(R.id.nego_acti);
        final EditText fech_acti = (EditText)view.findViewById(R.id.fech_acti);
        final EditText valo_acti = (EditText)view.findViewById(R.id.valo_acti);

        //Se añade el placeholder para cada campo de la interfaz
        EditText editText[] = {desc_acti, tipo_acti, orga_acti, pers_acti, nego_acti, fech_acti, valo_acti};

        for (EditText anEditText : editText) {
            ActividadPrincipal.addPlaceholder(anEditText);
        }

        //Evento de escucha para el botón del fragmento que reestablece las cajas de texto
        botn_acti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desc_acti.setText(R.string.tag_desc);
                tipo_acti.setText(R.string.tag_type);
                orga_acti.setText(R.string.tag_company);
                pers_acti.setText(R.string.tag_person);
                nego_acti.setText(R.string.tag_business);
                fech_acti.setText(R.string.tag_date);
                valo_acti.setText(R.string.tag_price);

                //Notificación toast para la acción del botón
                Toast.makeText(getActivity(), R.string.tag_toast_activities, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }


}
