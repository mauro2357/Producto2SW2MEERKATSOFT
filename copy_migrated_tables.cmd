REM Workbench Table Data copy script
REM 
REM Execute this to copy table data from a source RDBMS to MySQL.
REM Edit the options below to customize it. You will need to provide passwords, at least.
REM 
REM Source DB: Mysql@127.0.0.1:3306 (MySQL)
REM Target DB: Mysql@127.0.0.1:3306


REM Source and target DB passwords
set arg_source_password=
set arg_target_password=
REM Uncomment the following options according to your needs

REM Whether target tables should be truncated before copy
REM set arg_truncate_target=--truncate-target
REM Enable debugging output
REM set arg_debug_output=--log-level=debug3

wbcopytables.exe --mysql-source=root@127.0.0.1:3306 --target=root@127.0.0.1:3306  --source-password="%arg_source_password%" --target-password="%arg_target_password%" %arg_truncate_target% %arg_debug_output% --table '`future`' '`administrador`' '`futurem`' '`administrador`' '`Ad_id`, `Ad_nombre`, `Ad_apellido`, `Ad_telefono`, `Ad_clave`' --table '`future`' '`producto`' '`futurem`' '`producto`' '`Pro_id`, `Pro_nombre`, `Pro_valor`, `Pro_descripcion`' --table '`future`' '`mesa`' '`futurem`' '`mesa`' '`Mesa_id`, `Mesa_estado`' --table '`future`' '`insumos`' '`futurem`' '`insumos`' '`Ins_id`, `Ins_nombre`, `Ins_valor`' --table '`future`' '`detalles_compras`' '`futurem`' '`detalles_compras`' '`Com_id`, `Ins_id`, `Dtc_cantidad`' --table '`future`' '`detalles_venta`' '`futurem`' '`detalles_venta`' '`Pro_id`, `Ven_id`, `Dtv_cantidad`' --table '`future`' '`venta`' '`futurem`' '`venta`' '`Ven_id`, `Ven_fecha`, `Ven_estado`, `Cli_id`, `Me_id`, `Mesa_id`, `Caj_id`' --table '`future`' '`despachador`' '`futurem`' '`despachador`' '`Des_Id`, `Des_nombre`, `Des_apellido`, `Des_telefono`' --table '`future`' '`compras`' '`futurem`' '`compras`' '`Com_id`, `Com_fecha`' --table '`future`' '`cliente`' '`futurem`' '`cliente`' '`Cli_id`, `Cli_nombre`, `Cli_apellido`, `Cli_sexo`, `Cli_puntos`, `Cli_musica`, `Cli_email`, `Cli_telefono`' --table '`future`' '`cajero`' '`futurem`' '`cajero`' '`Caj_id`, `Caj_nombre`, `Caj_apellido`, `Caj_clave`, `Caj_telefono`' --table '`future`' '`mesero`' '`futurem`' '`mesero`' '`Me_id`, `Me_Nombre`, `Me_apellido`, `Me_telefono`'

