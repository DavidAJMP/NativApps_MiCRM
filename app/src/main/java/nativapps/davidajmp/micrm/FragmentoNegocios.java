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
 * Fragmento para la sección "Negocios"
 */

public class FragmentoNegocios extends Fragment {

    private LinearLayoutManager linearLayout;

    public FragmentoNegocios() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_negocios, container, false);

        //Instanciación de los elementos del fragmento
        Button botn_nego = (Button)view.findViewById(R.id.botn_nego);
        final EditText titu_nego = (EditText)view.findViewById(R.id.titu_nego);
        final EditText desc_nego = (EditText)view.findViewById(R.id.desc_nego);
        final EditText orga_nego = (EditText)view.findViewById(R.id.orga_nego);
        final EditText pers_nego = (EditText)view.findViewById(R.id.pers_nego);
        final EditText valo_nego = (EditText)view.findViewById(R.id.valo_nego);
        final EditText fech_nego = (EditText)view.findViewById(R.id.fech_nego);
        final EditText esta_nego = (EditText)view.findViewById(R.id.esta_nego);

        //Se añade el placeholder para cada campo de la interfaz
        EditText editText[] = {titu_nego, desc_nego, orga_nego, pers_nego, valo_nego, fech_nego, esta_nego};

        for (EditText anEditText : editText) {
            ActividadPrincipal.addPlaceholder(anEditText);
        }

        //Evento de escucha para el botón del fragmento que reestablece las cajas de texto
        botn_nego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titu_nego.setText(R.string.tag_title);
                desc_nego.setText(R.string.tag_desc);
                orga_nego.setText(R.string.tag_company);
                pers_nego.setText(R.string.tag_person);
                valo_nego.setText(R.string.tag_price);
                fech_nego.setText(R.string.tag_close_date);
                esta_nego.setText(R.string.tag_state);

                //Notificación toast para la acción del botón
                Toast.makeText(getActivity(), R.string.tag_toast_business, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }


}
