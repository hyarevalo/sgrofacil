PGDMP                  
        z         	   agrofacil    14.1    14.1                 0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                        0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            !           1262    41147 	   agrofacil    DATABASE     e   CREATE DATABASE agrofacil WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Spain.1252';
    DROP DATABASE agrofacil;
                postgres    false            �            1259    41148    cliente    TABLE       CREATE TABLE public.cliente (
    cedula_cliente bigint NOT NULL,
    nombre_cliente character varying,
    apellido_cliente character varying,
    telefono_cliente bigint,
    correo_cliente character varying NOT NULL,
    direccion_cliente character varying
);
    DROP TABLE public.cliente;
       public         heap    postgres    false            �            1259    41153    detalle_venta    TABLE     �   CREATE TABLE public.detalle_venta (
    id_venta integer,
    id_producto integer,
    cantidad_venta integer,
    valor_detalle integer
);
 !   DROP TABLE public.detalle_venta;
       public         heap    postgres    false            �            1259    41156    empleado    TABLE     �   CREATE TABLE public.empleado (
    cedula_empleado bigint NOT NULL,
    nombre1_empleado text,
    apellido1_empleado text,
    telefono_empleado bigint,
    correo_empleado text NOT NULL,
    direccion_empleado text,
    fecha_ingreso_empleado date
);
    DROP TABLE public.empleado;
       public         heap    postgres    false            �            1259    41161    familia    TABLE     x   CREATE TABLE public.familia (
    id_familia integer NOT NULL,
    nombre_familia text,
    descripcion_familia text
);
    DROP TABLE public.familia;
       public         heap    postgres    false            �            1259    41166    producto    TABLE       CREATE TABLE public.producto (
    id_producto integer NOT NULL,
    nombre_producto text,
    descripcion_producto text,
    id_familia integer,
    nit_provedor integer,
    existencia_producto integer,
    stock_minimo_producto integer,
    valor_producto integer
);
    DROP TABLE public.producto;
       public         heap    postgres    false            �            1259    41171 	   proveedor    TABLE     �   CREATE TABLE public.proveedor (
    nit_proveedor bigint NOT NULL,
    nombre_proveedor character varying,
    correo_proveedor character varying,
    telefono_proveedor bigint,
    direccion_proveedor character varying,
    contacto_proveedor bigint
);
    DROP TABLE public.proveedor;
       public         heap    postgres    false            �            1259    41176    usuario    TABLE     �   CREATE TABLE public.usuario (
    usuario character varying NOT NULL,
    "contraseña_user" character varying NOT NULL,
    tipo_user character varying NOT NULL
);
    DROP TABLE public.usuario;
       public         heap    postgres    false            �            1259    41181    venta    TABLE     �   CREATE TABLE public.venta (
    id_venta bigint NOT NULL,
    fecha_venta date,
    valortotal_venta bigint,
    cedula_cliente bigint,
    cedula_empleado bigint
);
    DROP TABLE public.venta;
       public         heap    postgres    false                      0    41148    cliente 
   TABLE DATA           �   COPY public.cliente (cedula_cliente, nombre_cliente, apellido_cliente, telefono_cliente, correo_cliente, direccion_cliente) FROM stdin;
    public          postgres    false    209   �'                 0    41153    detalle_venta 
   TABLE DATA           ]   COPY public.detalle_venta (id_venta, id_producto, cantidad_venta, valor_detalle) FROM stdin;
    public          postgres    false    210   \(                 0    41156    empleado 
   TABLE DATA           �   COPY public.empleado (cedula_empleado, nombre1_empleado, apellido1_empleado, telefono_empleado, correo_empleado, direccion_empleado, fecha_ingreso_empleado) FROM stdin;
    public          postgres    false    211   �(                 0    41161    familia 
   TABLE DATA           R   COPY public.familia (id_familia, nombre_familia, descripcion_familia) FROM stdin;
    public          postgres    false    212   =)                 0    41166    producto 
   TABLE DATA           �   COPY public.producto (id_producto, nombre_producto, descripcion_producto, id_familia, nit_provedor, existencia_producto, stock_minimo_producto, valor_producto) FROM stdin;
    public          postgres    false    213   �)                 0    41171 	   proveedor 
   TABLE DATA           �   COPY public.proveedor (nit_proveedor, nombre_proveedor, correo_proveedor, telefono_proveedor, direccion_proveedor, contacto_proveedor) FROM stdin;
    public          postgres    false    214   ;*                 0    41176    usuario 
   TABLE DATA           I   COPY public.usuario (usuario, "contraseña_user", tipo_user) FROM stdin;
    public          postgres    false    215   �*                 0    41181    venta 
   TABLE DATA           i   COPY public.venta (id_venta, fecha_venta, valortotal_venta, cedula_cliente, cedula_empleado) FROM stdin;
    public          postgres    false    216   +       z           2606    41185    empleado empleado_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT empleado_pkey PRIMARY KEY (cedula_empleado);
 @   ALTER TABLE ONLY public.empleado DROP CONSTRAINT empleado_pkey;
       public            postgres    false    211            |           2606    41187    familia familia_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.familia
    ADD CONSTRAINT familia_pkey PRIMARY KEY (id_familia);
 >   ALTER TABLE ONLY public.familia DROP CONSTRAINT familia_pkey;
       public            postgres    false    212            ~           2606    41189    producto producto_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.producto
    ADD CONSTRAINT producto_pkey PRIMARY KEY (id_producto);
 @   ALTER TABLE ONLY public.producto DROP CONSTRAINT producto_pkey;
       public            postgres    false    213            �           2606    41191    proveedor proveedor_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.proveedor
    ADD CONSTRAINT proveedor_pkey PRIMARY KEY (nit_proveedor);
 B   ALTER TABLE ONLY public.proveedor DROP CONSTRAINT proveedor_pkey;
       public            postgres    false    214            x           2606    41193    cliente usuario_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (cedula_cliente);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT usuario_pkey;
       public            postgres    false    209            �           2606    41227    venta venta_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.venta
    ADD CONSTRAINT venta_pkey PRIMARY KEY (id_venta);
 :   ALTER TABLE ONLY public.venta DROP CONSTRAINT venta_pkey;
       public            postgres    false    216            �           2606    41241    venta cedula_cliente_venta    FK CONSTRAINT     �   ALTER TABLE ONLY public.venta
    ADD CONSTRAINT cedula_cliente_venta FOREIGN KEY (cedula_cliente) REFERENCES public.cliente(cedula_cliente);
 D   ALTER TABLE ONLY public.venta DROP CONSTRAINT cedula_cliente_venta;
       public          postgres    false    216    3192    209            �           2606    41250    venta cedula_empleado_venta    FK CONSTRAINT     �   ALTER TABLE ONLY public.venta
    ADD CONSTRAINT cedula_empleado_venta FOREIGN KEY (cedula_empleado) REFERENCES public.empleado(cedula_empleado);
 E   ALTER TABLE ONLY public.venta DROP CONSTRAINT cedula_empleado_venta;
       public          postgres    false    3194    216    211            �           2606    41206    producto id_familia_producto    FK CONSTRAINT     �   ALTER TABLE ONLY public.producto
    ADD CONSTRAINT id_familia_producto FOREIGN KEY (id_familia) REFERENCES public.familia(id_familia);
 F   ALTER TABLE ONLY public.producto DROP CONSTRAINT id_familia_producto;
       public          postgres    false    213    212    3196            �           2606    41211 '   detalle_venta id_producto_detalle_venta    FK CONSTRAINT     �   ALTER TABLE ONLY public.detalle_venta
    ADD CONSTRAINT id_producto_detalle_venta FOREIGN KEY (id_producto) REFERENCES public.producto(id_producto);
 Q   ALTER TABLE ONLY public.detalle_venta DROP CONSTRAINT id_producto_detalle_venta;
       public          postgres    false    3198    210    213            �           2606    41228 $   detalle_venta id_venta_detalle_venta    FK CONSTRAINT     �   ALTER TABLE ONLY public.detalle_venta
    ADD CONSTRAINT id_venta_detalle_venta FOREIGN KEY (id_venta) REFERENCES public.venta(id_venta);
 N   ALTER TABLE ONLY public.detalle_venta DROP CONSTRAINT id_venta_detalle_venta;
       public          postgres    false    210    216    3202            �           2606    41221    producto nit_proveedor_producto    FK CONSTRAINT     �   ALTER TABLE ONLY public.producto
    ADD CONSTRAINT nit_proveedor_producto FOREIGN KEY (nit_provedor) REFERENCES public.proveedor(nit_proveedor);
 I   ALTER TABLE ONLY public.producto DROP CONSTRAINT nit_proveedor_producto;
       public          postgres    false    214    213    3200               �   x���1�0Eg���*m�$`e�� ���J[�r.N��0�2�7���o)�����	�y��z�;�T�)�&QB��� ���j\f��q�W��e7�Fik��F~�͗�/g[��6�V5_�]�T�x�~p�X�DnS�u8C}��k�_�m0]�nbb�=�JU�{�#�.�a�����R�6R8}��Ƿ�|@q,�O�n�         ,   x�3�4400�4�44200�2q9�8M�\N������ �/�         �   x�M�M� ���)�@����z7$J��?^_�4շ������<��M�.-�\��N�T9�>J��4@��i�*���7X��5�9f2����~8���nm}��r�kjwn�����N�<E�Ӌ�,��V�^)��='         Z   x�=�1�0�N�Dj��tA�W�D!;��Ruz�A&:E=��)����'���~�[rD�NW�}|u��nd_)�O{'J���1��(#�         �   x�M�1
�0���>A���M���#tQ�nn��W�T��%���c��3��$V�C
[�88�@~�n�F��Cd4;L\6��ؽ�o%����j�p���tk�q�į5�S2�+e9�A����0^�j����b����(Q         �   x�M�K� D��)����<�lZb&�pa~�6]�t�GT(�4�e%�����Rp�Ftր���Ҧ'�96o�Z)=v��1�g�-��/�ѡ�NK~I4�Y�y�Ӈ���h�kCY(tҺ�/i�6�s`�]�9�         1   x�+-N-�442�LL����,.)JL�/�JLJ�K�KIr@�\1z\\\ X~�         2   x���  �7�WZ����мF�8�`�Y��QY[�w���M     