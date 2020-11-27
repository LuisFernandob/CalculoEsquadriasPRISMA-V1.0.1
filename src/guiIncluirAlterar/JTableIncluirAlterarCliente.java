/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiIncluirAlterar;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import dao.Cliente;
import dao.ClienteDAO;
import gui.TelaClientes;

/**
 *
 * @author luisf
 */
@SuppressWarnings("serial")
public class JTableIncluirAlterarCliente extends javax.swing.JFrame implements KeyListener {
	
	int idClienteAlterar = -1;
	String nomeCliente = new String();

    /**
     * Creates new form JTableIncluirCliente
     */
    public JTableIncluirAlterarCliente() {
    	addKeyListener(this);
  	    setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    	initComponents();
       
    }
    
    public JTableIncluirAlterarCliente(Cliente cliente) {
    	addKeyListener(this);
  	    setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    	initComponents(cliente);
    }

	public String converterDataMysqlParaJTable(String data) {
		
		String[] elementos = data.split("-",3);
 		String dataJTable = elementos[2];
 		dataJTable = dataJTable.concat("/");
 		dataJTable = dataJTable.concat(elementos[1]);
 		dataJTable = dataJTable.concat("/");
 		dataJTable = dataJTable.concat(elementos[0]);
	    return dataJTable;			
	}
	
	public String converterDataJTableParaMysql(String data)  {
				
			if(!data.isEmpty()) {
			String[] elementos = data.split("/",3);
	 		String datamysql = elementos[2];
	 		datamysql = datamysql.concat("-");
	 		datamysql = datamysql.concat(elementos[1]);
	 		datamysql = datamysql.concat("-");
	 		datamysql = datamysql.concat(elementos[0]);
		 	return datamysql;
			} else { String blank = new String("0000-00-00");
				return blank;}
			
	}

    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

 	   setTitle("Sistema para c�lculo de esquadrias -> Clientes -> Incluir");

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JTextField();
        txtObservacoes = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtNascimento = new javax.swing.JTextField();
        labelCabecalho = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("Nome:");

        jLabel3.setText("Empresa:");

        jLabel4.setText("Email:");

        jLabel5.setText("Endere�o:");

        jLabel6.setText("CPF:");

        jLabel7.setText("CNPJ:");

        jLabel8.setText("Observa��es:");

        jLabel9.setText("Telefone:");

        jLabel10.setText("Nascimento:");
        
        
        
        
        
        
        txtEmpresa = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JTextField();
        txtObservacoes = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtNascimento = new javax.swing.JTextField();
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txtTelefone)))
                    .addComponent(txtObservacoes)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco)
                            .addComponent(txtNome)
                            .addComponent(txtEmpresa))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObservacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );


        labelCabecalho.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelCabecalho.setText("Novo cadastro de cliente.");

        jButton1.setText("INCLUIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Os campos com * s�o obrigat�rios.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCabecalho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    	this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

    }// </editor-fold>          
    
    //**************************************************************************************
    private void initComponents(Cliente cliente) {
    	
    	idClienteAlterar = cliente.getIdCliente();
    	nomeCliente = cliente.getNome();

  	   setTitle("Sistema para c�lculo de esquadrias -> Clientes -> Alterar");

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JTextField();
        txtObservacoes = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtNascimento = new javax.swing.JTextField();
        labelCabecalho = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("Nome:");

        jLabel3.setText("Empresa:");

        jLabel4.setText("Email:");

        jLabel5.setText("Endere�o:");

        jLabel6.setText("CPF:");

        jLabel7.setText("CNPJ:");

        jLabel8.setText("Observa��es:");

        jLabel9.setText("Telefone:");

        jLabel10.setText("Nascimento:");
        
       
        
        
        txtCNPJ.setText(cliente.getCnpj());
        txtCPF.setText(cliente.getCpf());
        txtEmail.setText(cliente.getEmail());
        txtEmpresa.setText(cliente.getEmpresa());
        txtEndereco.setText(cliente.getEndereco());
        txtNascimento.setText(converterDataMysqlParaJTable(cliente.getDataNascimento()));
        txtNome.setText(cliente.getNome());
        txtObservacoes.setText(cliente.getObservacoes());
        txtTelefone.setText(cliente.getTelefone());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txtTelefone)))
                    .addComponent(txtObservacoes)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco)
                            .addComponent(txtNome)
                            .addComponent(txtEmpresa))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObservacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );


        labelCabecalho.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelCabecalho.setText("Editando cliente n� "+ idClienteAlterar+" - "+nomeCliente);

        jButton3.setText("ALTERAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Os campos com * s�o obrigat�rios.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCabecalho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    	this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

    }// </editor-fold>    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	  
    	if (!txtNome.getText().isEmpty()) {
    	Cliente c = new Cliente();
    	ClienteDAO cDAO = new ClienteDAO();
    	
    	
    	c.setNome(txtNome.getText());
		c.setEmpresa(txtEmpresa.getText());
		c.setTelefone(txtTelefone.getText());
		c.setEndereco(txtEndereco.getText());
		c.setEmail(txtEmail.getText());
		c.setDataNascimento(converterDataJTableParaMysql(txtNascimento.getText()));
		c.setCnpj(txtCNPJ.getText());
		c.setCpf(txtCPF.getText());
		c.setObservacoes(txtObservacoes.getText());
		
		cDAO.criarCliente(c);
		
		txtCNPJ.setText("");
        txtCPF.setText("");
        txtEmail.setText("");
        txtEmpresa.setText("");
        txtEndereco.setText("");
        txtNascimento.setText("");
        txtNome.setText("");
        txtObservacoes.setText("");
        txtTelefone.setText("");
		
        this.dispose();
        new TelaClientes().setVisible(true);
    	} else {JOptionPane.showMessageDialog(null, "Digite o nome do cliente!");}
    	
    }                                        
    

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {    
        
        this.dispose();
        new TelaClientes().setVisible(true);
    }                   
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    		
    		
            Cliente c = new Cliente();
            ClienteDAO dao = new ClienteDAO();
            
           	c.setIdCliente(idClienteAlterar);
    		c.setNome(txtNome.getText());
    		c.setEmpresa(txtEmpresa.getText());
    		c.setTelefone(txtTelefone.getText());
    		c.setEndereco(txtEndereco.getText());
    		c.setEmail(txtEmail.getText());
    		c.setDataNascimento(converterDataJTableParaMysql(txtNascimento.getText()));
    		c.setCnpj(txtCNPJ.getText());
    		c.setCpf(txtCPF.getText());
    		c.setObservacoes(txtObservacoes.getText());
    		
            dao.update(c);
           
            txtNome.setText("");
            txtEmpresa.setText("");
            txtTelefone.setText("");
            txtEndereco.setText("");
            txtEmail.setText("");
            txtNascimento.setText("");
            txtCNPJ.setText("");
            txtCPF.setText("");
            txtObservacoes.setText("");
            
            this.dispose();
            new TelaClientes().setVisible(true);  
        }                                        


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
            java.util.logging.Logger.getLogger(JTableIncluirAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTableIncluirAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTableIncluirAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTableIncluirAlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTableIncluirAlterarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCabecalho;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObservacoes;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration                   

    @Override
    public void keyTyped(KeyEvent e) {
    	
    	
    }

    @Override
    public void keyPressed(KeyEvent e) {
    	 
    	int key = e.getKeyCode();
    	
    	if(key == KeyEvent.VK_ENTER){
             
    		if(idClienteAlterar==-1) {
    			
	    		if (!txtNome.getText().isEmpty()) {
	    			
	    	    	Cliente c = new Cliente();
	    	    	ClienteDAO cDAO = new ClienteDAO();
	    	    	
	    	    	
	    	    	c.setNome(txtNome.getText());
	    			c.setEmpresa(txtEmpresa.getText());
	    			c.setTelefone(txtTelefone.getText());
	    			c.setEndereco(txtEndereco.getText());
	    			c.setEmail(txtEmail.getText());
	    			c.setDataNascimento(converterDataJTableParaMysql(txtNascimento.getText()));
	    			c.setCnpj(txtCNPJ.getText());
	    			c.setCpf(txtCPF.getText());
	    			c.setObservacoes(txtObservacoes.getText());
	    			
	    			cDAO.criarCliente(c);
	    			
	    			txtCNPJ.setText("");
	    	        txtCPF.setText("");
	    	        txtEmail.setText("");
	    	        txtEmpresa.setText("");
	    	        txtEndereco.setText("");
	    	        txtNascimento.setText("");
	    	        txtNome.setText("");
	    	        txtObservacoes.setText("");
	    	        txtTelefone.setText("");
	    			
	    	        this.dispose();
	    	        new TelaClientes().setVisible(true);
	    	    } else {
	    	    	
	    	    		JOptionPane.showMessageDialog(null, "Digite o nome do cliente!");
	    	    
	    	    	   }
    		} else {
    			
    				Cliente c = new Cliente();
    	            ClienteDAO dao = new ClienteDAO();
    	            
    	           	c.setIdCliente(idClienteAlterar);
    	    		c.setNome(txtNome.getText());
    	    		c.setEmpresa(txtEmpresa.getText());
    	    		c.setTelefone(txtTelefone.getText());
    	    		c.setEndereco(txtEndereco.getText());
    	    		c.setEmail(txtEmail.getText());
    	    		c.setDataNascimento(converterDataJTableParaMysql(txtNascimento.getText()));
    	    		c.setCnpj(txtCNPJ.getText());
    	    		c.setCpf(txtCPF.getText());
    	    		c.setObservacoes(txtObservacoes.getText());
    	    		
    	            dao.update(c);
    	           
    	            txtNome.setText("");
    	            txtEmpresa.setText("");
    	            txtTelefone.setText("");
    	            txtEndereco.setText("");
    	            txtEmail.setText("");
    	            txtNascimento.setText("");
    	            txtCNPJ.setText("");
    	            txtCPF.setText("");
    	            txtObservacoes.setText("");
    	            
    	            this.dispose();
    	            new TelaClientes().setVisible(true);  
    			
    		}
    		
    		
         } else if(key == KeyEvent.VK_ESCAPE) {
                     	 
        	 this.dispose();
             new TelaClientes().setVisible(true);
    		 
         }
    	 
    }

    @Override
    public void keyReleased(KeyEvent e) {
    	// TODO Auto-generated method stub
    	
    }

}