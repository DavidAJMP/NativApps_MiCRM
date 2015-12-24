package nativapps.davidajmp.micrm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Fragmento para la sección "Personas"
 */

public class FragmentoPersonas extends Fragment {

    public FragmentoPersonas() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_personas, container, false);

        //Instanciación de los elementos del fragmento
        final Button botn_pers = (Button)view.findViewById(R.id.botn_pers);
        final EditText nomb_pers = (EditText)view.findViewById(R.id.nomb_pers);
        final EditText tele_pers = (EditText)view.findViewById(R.id.tele_pers);
        final EditText mail_pers = (EditText)view.findViewById(R.id.mail_pers);

        //Se añade el placeholder para cada campo de la interfaz
        EditText editText[] = {nomb_pers, tele_pers, mail_pers};

        for (EditText anEditText : editText) {
            ActividadPrincipal.addPlaceholder(anEditText);
        }

        //Evento de escucha para el botón del fragmento que reestablece las cajas de texto
        botn_pers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                nomb_pers.setText(R.string.tag_name);
                tele_pers.setText(R.string.tag_phone);
                mail_pers.setText(R.string.tag_mail);

                //Notificación toast para la acción del botón
                Toast.makeText(getActivity(), R.string.tag_toast_people, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
