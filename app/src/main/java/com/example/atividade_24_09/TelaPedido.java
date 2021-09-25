package com.example.atividade_24_09;

package com.example.atividade_24_09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class TelaPedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tela_pedido);

        Button FecharPedido = (Button) findViewById(R.id.FecharPedido);
        View button;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Resposta botão click fechar pedido
            }
        });

        Button CancelarPedido = (Button) findViewById(R.id.CancelarPedido);
        Switch opcaoExpresso;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Resposta botão click cancelar pedido
            }
    }

    //Seleção das opções

        Switch opcaoExpresso = (Switch) findViewById(R.id.opcaoExpresso);
        opcaoExpresso.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // opção selecionada
                } else {
                    // opção não selecionada
                }
            }
        });

        Switch opcaoExpressoComLeite = (Switch) findViewById(R.id.opcaoExpressoComLeite);
        opcaoExpressoComLeite.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // opção selecionada
                } else {
                    // opção não selecionada
                }
            }
        });

        Switch OpcaoCappuccino = (Switch) findViewById(R.id.OpcaoCappuccino);
        OpcaoCappuccino.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // opção selecionada
                } else {
                    // opção não selecionada
                }
            }
        });

        Switch opcaoAchocolatado = (Switch) findViewById(R.id.opcaoAchocolatado);
        opcaoAchocolatado.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // opção selecionada
                } else {
                    // opção não selecionada
                }
            }
        });


        Switch opcaoExpressoForte = (Switch) findViewById(R.id.opcaoExpressoForte);
        opcaoExpressoForte.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // opção selecionada
                } else {
                    // opção não selecionada
                }
            }
        });

        Switch opcaoExpressoUltraForte = (Switch) findViewById(R.id.opcaoExpressoUltraForte);
        opcaoExpressoUltraForte.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // opção selecionada
                } else {
                    // opção não selecionada
                }
            }
        });

        //Confirmando Opções

        Button FecharPedido = (Button) findViewById(R.id.FecharPedido);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Resposta botão click Fechar Pedido
            }
        });

        Button CancelarPedido = (Button) findViewById(R.id.CancelarPedido);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Resposta botão click cancelar
            }
        });


    }