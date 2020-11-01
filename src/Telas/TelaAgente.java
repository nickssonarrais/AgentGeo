/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Telas;

import Logica.Agente;
import Ultilitarios.FuncaoJTA;
import Ultilitarios.FuncaoJTF;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Nicksson
 */
public class TelaAgente extends javax.swing.JFrame {

    private final String[] linha3 = new String[]{null, null, null};
    
    private TelaPrincipal telaPrincipal;
    
    private TelaAgente() {
        initComponents();
    }
    
    public TelaAgente(TelaPrincipal telaPrincipal){
        this();
        this.telaPrincipal = telaPrincipal;
    }
    
   
     static DefaultTableModel tmAgentes = new DefaultTableModel(null,new String[]{"Agente", "Perfil", "Metadados"}){   
       //Impossibilitando a edição da tabela
      @Override
      public boolean isCellEditable(int row, int col){   
             return false;   
      }   
   }; 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelAgentes = new javax.swing.JPanel();
        painelTabelaAgente = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDeAgentes = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        painelDadosAgente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaMetadados = new javax.swing.JTextArea();
        jtfNmAgente = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        lbComando = new javax.swing.JLabel();
        btGravar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaPerfil = new javax.swing.JTextArea();
        lbComando1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Agentes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        painelAgentes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        painelTabelaAgente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabela de Agentes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        tabelaDeAgentes.setModel(tmAgentes);
        tabelaDeAgentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaDeAgentes.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabelaDeAgentes);

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTabelaAgenteLayout = new javax.swing.GroupLayout(painelTabelaAgente);
        painelTabelaAgente.setLayout(painelTabelaAgenteLayout);
        painelTabelaAgenteLayout.setHorizontalGroup(
            painelTabelaAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaAgenteLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelTabelaAgenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelTabelaAgenteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btEditar, btExcluir});

        painelTabelaAgenteLayout.setVerticalGroup(
            painelTabelaAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaAgenteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18)
                .addGroup(painelTabelaAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelTabelaAgenteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btEditar, btExcluir});

        painelDadosAgente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Agente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jtaMetadados.setColumns(20);
        jtaMetadados.setRows(5);
        jScrollPane1.setViewportView(jtaMetadados);

        jtfNmAgente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNome.setText("Nome:");

        lbComando.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbComando.setText("Perfil:");

        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        jtaPerfil.setColumns(20);
        jtaPerfil.setRows(5);
        jScrollPane3.setViewportView(jtaPerfil);

        lbComando1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbComando1.setText("Metadados:");

        javax.swing.GroupLayout painelDadosAgenteLayout = new javax.swing.GroupLayout(painelDadosAgente);
        painelDadosAgente.setLayout(painelDadosAgenteLayout);
        painelDadosAgenteLayout.setHorizontalGroup(
            painelDadosAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosAgenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbComando)
                    .addComponent(lbNome)
                    .addComponent(lbComando1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jtfNmAgente)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosAgenteLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        painelDadosAgenteLayout.setVerticalGroup(
            painelDadosAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosAgenteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNmAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbComando, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbComando1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btGravar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelAgentesLayout = new javax.swing.GroupLayout(painelAgentes);
        painelAgentes.setLayout(painelAgentesLayout);
        painelAgentesLayout.setHorizontalGroup(
            painelAgentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAgentesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(painelTabelaAgente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDadosAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelAgentesLayout.setVerticalGroup(
            painelAgentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAgentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAgentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelDadosAgente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTabelaAgente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAgentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAgentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        telaPrincipal.setEnabled(true);
        
        if(Agente.abrirArquivoAgente()){
            telaPrincipal.limparPainelAgente();
        }
    }//GEN-LAST:event_formWindowClosing

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        if(tabelaDeAgentes.getSelectedRow() >= 0){
           
                try {
                    jtfNmAgente.setText(tmAgentes.getValueAt(tabelaDeAgentes.getSelectedRow(), 0).toString());
                    jtaPerfil.setText(tmAgentes.getValueAt(tabelaDeAgentes.getSelectedRow(), 1).toString());
                    jtaMetadados.setText(tmAgentes.getValueAt(tabelaDeAgentes.getSelectedRow(), 2).toString());
                    tmAgentes.removeRow(tabelaDeAgentes.getSelectedRow());
                    btEditar.setEnabled(false);
               } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ERRO: "+e.getMessage());
              }

        }else{
            JOptionPane.showMessageDialog(null, "ERRO: Nenhum Agente Foi Selecionado");
        }
       
    }//GEN-LAST:event_btEditarActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        if(FuncaoJTF.validarString(jtfNmAgente) && FuncaoJTA.validarString(jtaPerfil) && FuncaoJTA.validarString(jtaMetadados)){
            
            int resposta = JOptionPane.showConfirmDialog(null,"Você Deseja Salvar Todos Esse Agente");
            
            if(resposta == JOptionPane.YES_OPTION){  
                 try {
                    tmAgentes.addRow(linha3);
                    tmAgentes.setValueAt(jtfNmAgente.getText(), tmAgentes.getRowCount()-1, 0);
                    tmAgentes.setValueAt(jtaPerfil.getText(), tmAgentes.getRowCount()-1, 1);
                    tmAgentes.setValueAt(jtaMetadados.getText(), tmAgentes.getRowCount()-1, 2);                    
                    limparCampos();                    
                    preencherListaAgentesDaTabela();
                    Agente.criarArquivoAgente();
                    btEditar.setEnabled(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERRO: "+e.getMessage());
                }
   
            }   
        }
    }//GEN-LAST:event_btGravarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if(tabelaDeAgentes.getSelectedRow() >= 0){
            int resposta = JOptionPane.showConfirmDialog(null,"Você Deseja Realmente Apagar esse Item?");
            if(resposta == JOptionPane.YES_OPTION){
                tmAgentes.removeRow(tabelaDeAgentes.getSelectedRow());
                preencherListaAgentesDaTabela();
                Agente.criarArquivoAgente();
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Nenhum Item Foi Selecionado");
        }    
    }//GEN-LAST:event_btExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAgente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAgente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAgente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAgente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAgente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btGravar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jtaMetadados;
    private javax.swing.JTextArea jtaPerfil;
    private javax.swing.JTextField jtfNmAgente;
    private javax.swing.JLabel lbComando;
    private javax.swing.JLabel lbComando1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JPanel painelAgentes;
    private javax.swing.JPanel painelDadosAgente;
    private javax.swing.JPanel painelTabelaAgente;
    private javax.swing.JTable tabelaDeAgentes;
    // End of variables declaration//GEN-END:variables

  private void preencherListaAgentesDaTabela(){    
        //limpar a lista dos agentes
        Agente.listaDeAgentes.clear();
       for (int i = 0; i < tmAgentes.getRowCount(); i++) {
           try {
               Agente a = new Agente();
               a.setNmAgente(tmAgentes.getValueAt(i, 0).toString());
               a.setPerfilAgente(tmAgentes.getValueAt(i, 1).toString());
               a.setMetaDados(tmAgentes.getValueAt(i, 2).toString());
               Agente.listaDeAgentes.add(a);
            } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e.getMessage());
           }
       }  
    }

  public void preencherTabelaAgentes(){
      //Limpar tabelas do Agente
      while (tmAgentes.getRowCount() > 0) {
        tmAgentes.removeRow(0);
      } 
        if(Agente.listaDeAgentes.isEmpty()){
            JOptionPane.showMessageDialog(null,"Não Existe Agentes Cadastrados");
        }else{
           //Preenche a tabela com os agentes existentes
           for (int i = 0; i < Agente.listaDeAgentes.size(); i++) {   
               try {
                    tmAgentes.addRow(linha3);
                    tmAgentes.setValueAt(Agente.listaDeAgentes.get(i).getNmAgente(), i, 0);
                    tmAgentes.setValueAt(Agente.listaDeAgentes.get(i).getPerfilAgente(), i, 1); 
                    tmAgentes.setValueAt(Agente.listaDeAgentes.get(i).getMetaDados(), i, 2); 
               } catch (Exception e) {
                   JOptionPane.showMessageDialog(null,"ERRO:"+e.getMessage());
               }             
           }
        }
    }
  
  public void limparCampos() {
        jtfNmAgente.setText("");
        jtaMetadados.setText("");
        jtaPerfil.setText("");
        btEditar.setEnabled(true);
    }
     
     

}
