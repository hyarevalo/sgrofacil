/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.*;
import javax.swing.ImageIcon;
/**
 *
 * @author usuario
 */
public class principal extends javax.swing.JFrame implements Runnable {
    String horas,minutos,segundos;
    Thread hilo;

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        fecha.setText(fecha());
        hilo=new Thread(this);
        hilo.start();
        setVisible(true);
    }
    
    public void hora(){
        
        Calendar calendario=new GregorianCalendar();
        Date horaactual=new Date();
        calendario.setTime(horaactual);
        horas=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    public void run(){
        
        Thread current=Thread.currentThread();
        while(current==hilo){
            hora();
            horatxt.setText(horas+":"+minutos+":"+segundos);
        }

    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        fondo_menu = new javax.swing.JPanel();
        panel_inicio = new javax.swing.JPanel();
        inicio = new javax.swing.JLabel();
        icono_inicio = new javax.swing.JLabel();
        panel_venta = new javax.swing.JPanel();
        venta = new javax.swing.JLabel();
        icono_venta = new javax.swing.JLabel();
        panel_detalleventa = new javax.swing.JPanel();
        icono_detalleventa = new javax.swing.JLabel();
        usuario1 = new javax.swing.JLabel();
        panel_producto = new javax.swing.JPanel();
        producto = new javax.swing.JLabel();
        icono_producto = new javax.swing.JLabel();
        panel_cliente = new javax.swing.JPanel();
        cliente = new javax.swing.JLabel();
        icono_cliente = new javax.swing.JLabel();
        panel_proveedor = new javax.swing.JPanel();
        proveedor = new javax.swing.JLabel();
        icono_proveedor = new javax.swing.JLabel();
        panel_familia = new javax.swing.JPanel();
        familia = new javax.swing.JLabel();
        icono_familia = new javax.swing.JLabel();
        panel_empleado = new javax.swing.JPanel();
        empleado = new javax.swing.JLabel();
        icono_empleado = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        panel_usuario = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        icono_usuario = new javax.swing.JLabel();
        fechas = new javax.swing.JLabel();
        horatxt = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_bienvenidos = new javax.swing.JPanel();
        bienvenidos = new javax.swing.JLabel();
        supermercado_agrofacil = new javax.swing.JLabel();
        bg2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_menu.setBackground(new java.awt.Color(0, 204, 0));
        fondo_menu.setForeground(new java.awt.Color(255, 255, 255));
        fondo_menu.setLayout(null);

        panel_inicio.setBackground(new java.awt.Color(153, 255, 51));
        panel_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_inicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_inicioMouseExited(evt);
            }
        });
        panel_inicio.setLayout(null);

        inicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inicio.setText("Crear cuenta");
        panel_inicio.add(inicio);
        inicio.setBounds(60, 0, 90, 54);

        icono_inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagina-de-inicio (3).png"))); // NOI18N
        panel_inicio.add(icono_inicio);
        icono_inicio.setBounds(10, 10, 45, 32);

        fondo_menu.add(panel_inicio);
        panel_inicio.setBounds(0, 160, 170, 50);

        panel_venta.setBackground(new java.awt.Color(153, 255, 51));
        panel_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_ventaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_ventaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_ventaMouseExited(evt);
            }
        });
        panel_venta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        venta.setBackground(new java.awt.Color(204, 204, 204));
        venta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        venta.setText("Venta");
        panel_venta.add(venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 0, -1, 50));

        icono_venta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        panel_venta.add(icono_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 45, 50));

        fondo_menu.add(panel_venta);
        panel_venta.setBounds(0, 580, 170, 50);

        panel_detalleventa.setBackground(new java.awt.Color(153, 255, 51));
        panel_detalleventa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_detalleventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_detalleventaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_detalleventaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_detalleventaMouseExited(evt);
            }
        });
        panel_detalleventa.setLayout(null);

        icono_detalleventa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono_detalleventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bolsa-de-la-compra.png"))); // NOI18N
        panel_detalleventa.add(icono_detalleventa);
        icono_detalleventa.setBounds(10, 11, 41, 32);

        usuario1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuario1.setText("Detalle venta");
        panel_detalleventa.add(usuario1);
        usuario1.setBounds(60, 20, 90, 17);

        fondo_menu.add(panel_detalleventa);
        panel_detalleventa.setBounds(0, 220, 170, 50);

        panel_producto.setBackground(new java.awt.Color(153, 255, 51));
        panel_producto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_productoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_productoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_productoMouseExited(evt);
            }
        });

        producto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        producto.setText("Producto");

        icono_producto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito-de-supermercado.png"))); // NOI18N

        javax.swing.GroupLayout panel_productoLayout = new javax.swing.GroupLayout(panel_producto);
        panel_producto.setLayout(panel_productoLayout);
        panel_productoLayout.setHorizontalGroup(
            panel_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_productoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(producto)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panel_productoLayout.setVerticalGroup(
            panel_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_productoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        fondo_menu.add(panel_producto);
        panel_producto.setBounds(0, 280, 170, 50);

        panel_cliente.setBackground(new java.awt.Color(153, 255, 51));
        panel_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_clienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_clienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_clienteMouseExited(evt);
            }
        });
        panel_cliente.setLayout(null);

        cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cliente.setText("Cliente");
        panel_cliente.add(cliente);
        cliente.setBounds(60, 10, 47, 39);

        icono_cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atencion-al-cliente.png"))); // NOI18N
        panel_cliente.add(icono_cliente);
        icono_cliente.setBounds(10, 10, 45, 39);

        fondo_menu.add(panel_cliente);
        panel_cliente.setBounds(0, 340, 170, 50);

        panel_proveedor.setBackground(new java.awt.Color(153, 255, 51));
        panel_proveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_proveedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_proveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_proveedorMouseExited(evt);
            }
        });

        proveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        proveedor.setText("Proveedor");

        icono_proveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedor (1).png"))); // NOI18N

        javax.swing.GroupLayout panel_proveedorLayout = new javax.swing.GroupLayout(panel_proveedor);
        panel_proveedor.setLayout(panel_proveedorLayout);
        panel_proveedorLayout.setHorizontalGroup(
            panel_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_proveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proveedor)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panel_proveedorLayout.setVerticalGroup(
            panel_proveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_proveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono_proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        fondo_menu.add(panel_proveedor);
        panel_proveedor.setBounds(0, 400, 170, 50);

        panel_familia.setBackground(new java.awt.Color(153, 255, 51));
        panel_familia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_familia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_familiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_familiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_familiaMouseExited(evt);
            }
        });
        panel_familia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        familia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        familia.setText("Familia");
        panel_familia.add(familia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 39));

        icono_familia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono_familia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/picnic.png"))); // NOI18N
        panel_familia.add(icono_familia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 45, 39));

        fondo_menu.add(panel_familia);
        panel_familia.setBounds(0, 460, 170, 50);

        panel_empleado.setBackground(new java.awt.Color(153, 255, 51));
        panel_empleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_empleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_empleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_empleadoMouseExited(evt);
            }
        });

        empleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empleado.setText("Empleado");

        icono_empleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleado.png"))); // NOI18N

        javax.swing.GroupLayout panel_empleadoLayout = new javax.swing.GroupLayout(panel_empleado);
        panel_empleado.setLayout(panel_empleadoLayout);
        panel_empleadoLayout.setHorizontalGroup(
            panel_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_empleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empleado)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panel_empleadoLayout.setVerticalGroup(
            panel_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_empleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icono_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondo_menu.add(panel_empleado);
        panel_empleado.setBounds(0, 520, 170, 50);

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_login1.png"))); // NOI18N
        fondo_menu.add(icono);
        icono.setBounds(30, 0, 104, 95);

        panel_usuario.setBackground(new java.awt.Color(153, 255, 51));
        panel_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_usuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_usuarioMouseExited(evt);
            }
        });

        usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuario.setText("Inicio");

        icono_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagina-de-inicio (3).png"))); // NOI18N

        javax.swing.GroupLayout panel_usuarioLayout = new javax.swing.GroupLayout(panel_usuario);
        panel_usuario.setLayout(panel_usuarioLayout);
        panel_usuarioLayout.setHorizontalGroup(
            panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panel_usuarioLayout.setVerticalGroup(
            panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icono_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondo_menu.add(panel_usuario);
        panel_usuario.setBounds(0, 100, 170, 50);

        fechas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fechas.setText("FECHA:");
        fondo_menu.add(fechas);
        fechas.setBounds(10, 670, 60, 14);

        horatxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        horatxt.setText("00:00:00");
        fondo_menu.add(horatxt);
        horatxt.setBounds(70, 640, 70, 15);

        fecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fecha.setText("DD/MM/YYYY");
        fondo_menu.add(fecha);
        fecha.setBounds(70, 670, 90, 15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("HORA:");
        fondo_menu.add(jLabel1);
        jLabel1.setBounds(10, 640, 50, 15);

        bg.add(fondo_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 700));

        panel_bienvenidos.setBackground(new java.awt.Color(0, 204, 0));
        panel_bienvenidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bienvenidos.setFont(new java.awt.Font("Leelawadee UI", 3, 36)); // NOI18N
        bienvenidos.setForeground(new java.awt.Color(255, 255, 255));
        bienvenidos.setText("    ¡Bienvenidos!...");
        panel_bienvenidos.add(bienvenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 410, 50));

        supermercado_agrofacil.setFont(new java.awt.Font("Leelawadee UI", 3, 36)); // NOI18N
        supermercado_agrofacil.setForeground(new java.awt.Color(255, 255, 255));
        supermercado_agrofacil.setText("Supermercado AgroFacil");
        panel_bienvenidos.add(supermercado_agrofacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 420, 50));

        bg.add(panel_bienvenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 900, 100));

        bg2.setBackground(new java.awt.Color(255, 255, 255));
        bg2.setPreferredSize(new java.awt.Dimension(900, 550));

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        bg.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 840, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public static String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/yyyy");
        return formatofecha.format(fecha);
    }
    private void panel_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_inicioMouseEntered
        panel_inicio.setBackground(Color.orange);
    }//GEN-LAST:event_panel_inicioMouseEntered

    private void panel_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_inicioMouseExited
        panel_inicio.setBackground(new Color(153,255,51));
    }//GEN-LAST:event_panel_inicioMouseExited

    private void panel_ventaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_ventaMouseEntered
        panel_venta.setBackground(Color.orange);
    }//GEN-LAST:event_panel_ventaMouseEntered

    private void panel_ventaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_ventaMouseExited
        panel_venta.setBackground(new Color(153,255,51));
    }//GEN-LAST:event_panel_ventaMouseExited

    private void panel_detalleventaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_detalleventaMouseEntered
        panel_detalleventa.setBackground(Color.orange);
    }//GEN-LAST:event_panel_detalleventaMouseEntered

    private void panel_detalleventaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_detalleventaMouseExited
        panel_detalleventa.setBackground(new Color(153,255,51));
    }//GEN-LAST:event_panel_detalleventaMouseExited

    private void panel_productoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_productoMouseEntered
        panel_producto.setBackground(Color.orange);
    }//GEN-LAST:event_panel_productoMouseEntered

    private void panel_productoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_productoMouseExited
        panel_producto.setBackground(new Color(153,255,51));
    }//GEN-LAST:event_panel_productoMouseExited

    private void panel_clienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_clienteMouseEntered
        panel_cliente.setBackground(Color.orange);
    }//GEN-LAST:event_panel_clienteMouseEntered

    private void panel_clienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_clienteMouseExited
        panel_cliente.setBackground(new Color(153,255,51));
    }//GEN-LAST:event_panel_clienteMouseExited

    private void panel_proveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_proveedorMouseEntered
        panel_proveedor.setBackground(Color.orange);
    }//GEN-LAST:event_panel_proveedorMouseEntered

    private void panel_proveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_proveedorMouseExited
        panel_proveedor.setBackground(new Color(153,255,51));
    }//GEN-LAST:event_panel_proveedorMouseExited

    private void panel_familiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_familiaMouseEntered
        panel_familia.setBackground(Color.orange);
    }//GEN-LAST:event_panel_familiaMouseEntered

    private void panel_familiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_familiaMouseExited
        panel_familia.setBackground(new Color(153,255,51));
    }//GEN-LAST:event_panel_familiaMouseExited

    private void panel_empleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_empleadoMouseEntered
        panel_empleado.setBackground(Color.orange);
    }//GEN-LAST:event_panel_empleadoMouseEntered

    private void panel_empleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_empleadoMouseExited
        panel_empleado.setBackground(new Color(153,255,51));
    }//GEN-LAST:event_panel_empleadoMouseExited

    private void panel_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_usuarioMouseEntered
        panel_usuario.setBackground(Color.orange);
    }//GEN-LAST:event_panel_usuarioMouseEntered

    private void panel_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_usuarioMouseExited
        panel_usuario.setBackground(new Color(153,255,51));
    }//GEN-LAST:event_panel_usuarioMouseExited

    private void panel_ventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_ventaMouseClicked
        Venta abrir = new Venta();
        abrir.setSize(800, 500);
        abrir.setLocation(0, 0);

        bg2.removeAll();
        bg2.add(abrir, BorderLayout.CENTER);
        bg2.revalidate();
        bg2.repaint();
    }//GEN-LAST:event_panel_ventaMouseClicked

    private void panel_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_clienteMouseClicked
        // TODO add your handling code here:
        Cliente abrir = new Cliente();
        abrir.setSize(800, 500);
        abrir.setLocation(0, 0);

        bg2.removeAll();
        bg2.add(abrir, BorderLayout.CENTER);
        bg2.revalidate();
        bg2.repaint();
    }//GEN-LAST:event_panel_clienteMouseClicked

    private void panel_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_productoMouseClicked
        Producto abrir = new Producto();
        abrir.setSize(800, 500);
        abrir.setLocation(0, 0);

        bg2.removeAll();
        bg2.add(abrir, BorderLayout.CENTER);
        bg2.revalidate();
        bg2.repaint();
    }//GEN-LAST:event_panel_productoMouseClicked

    private void panel_proveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_proveedorMouseClicked
        Proveedor abrir = new Proveedor();
        abrir.setSize(800, 500);
        abrir.setLocation(0, 0);

        bg2.removeAll();
        bg2.add(abrir, BorderLayout.CENTER);
        bg2.revalidate();
        bg2.repaint();
    }//GEN-LAST:event_panel_proveedorMouseClicked

    private void panel_familiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_familiaMouseClicked
        Familia abrir = new Familia();
        abrir.setSize(800, 500);
        abrir.setLocation(0, 0);

        bg2.removeAll();
        bg2.add(abrir, BorderLayout.CENTER);
        bg2.revalidate();
        bg2.repaint();
    }//GEN-LAST:event_panel_familiaMouseClicked

    private void panel_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_empleadoMouseClicked
        Empleado abrir = new Empleado();
        abrir.setSize(800, 500);
        abrir.setLocation(0, 0);

        bg2.removeAll();
        bg2.add(abrir, BorderLayout.CENTER);
        bg2.revalidate();
        bg2.repaint();
    }//GEN-LAST:event_panel_empleadoMouseClicked

    private void panel_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_inicioMouseClicked
        Crear_usuario abrir = new Crear_usuario();
        abrir.setSize(800, 500);
        abrir.setLocation(0, 0);

        bg2.removeAll();
        bg2.add(abrir, BorderLayout.CENTER);
        bg2.revalidate();
        bg2.repaint();
    }//GEN-LAST:event_panel_inicioMouseClicked

    private void panel_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_usuarioMouseClicked
        
    }//GEN-LAST:event_panel_usuarioMouseClicked

    private void panel_detalleventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_detalleventaMouseClicked
        Venta_detalle abrir = new Venta_detalle();
        abrir.setSize(800, 500);
        abrir.setLocation(0, 0);

        bg2.removeAll();
        bg2.add(abrir, BorderLayout.CENTER);
        bg2.revalidate();
        bg2.repaint();
    }//GEN-LAST:event_panel_detalleventaMouseClicked

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JLabel bienvenidos;
    private javax.swing.JLabel cliente;
    private javax.swing.JLabel empleado;
    private javax.swing.JLabel familia;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fechas;
    private javax.swing.JPanel fondo_menu;
    private javax.swing.JLabel horatxt;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel icono_cliente;
    private javax.swing.JLabel icono_detalleventa;
    private javax.swing.JLabel icono_empleado;
    private javax.swing.JLabel icono_familia;
    private javax.swing.JLabel icono_inicio;
    private javax.swing.JLabel icono_producto;
    private javax.swing.JLabel icono_proveedor;
    private javax.swing.JLabel icono_usuario;
    private javax.swing.JLabel icono_venta;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel_bienvenidos;
    private javax.swing.JPanel panel_cliente;
    private javax.swing.JPanel panel_detalleventa;
    private javax.swing.JPanel panel_empleado;
    private javax.swing.JPanel panel_familia;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_producto;
    private javax.swing.JPanel panel_proveedor;
    private javax.swing.JPanel panel_usuario;
    private javax.swing.JPanel panel_venta;
    private javax.swing.JLabel producto;
    private javax.swing.JLabel proveedor;
    private javax.swing.JLabel supermercado_agrofacil;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuario1;
    private javax.swing.JLabel venta;
    // End of variables declaration//GEN-END:variables
}
