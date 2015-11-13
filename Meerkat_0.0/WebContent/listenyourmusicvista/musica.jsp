<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listen your music</title>
    <%@ page import="java.util.*" %>
    <link href="https://dl.dropboxusercontent.com/u/243766780/jplayer/css/jplayer.pink.flag.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript"src="https://dl.dropboxusercontent.com/u/243766780/jplayer/js/jquery.js"></script>
    <script type="text/javascript" src="https://dl.dropboxusercontent.com/u/243766780/jplayer/add-on/jplayer.playlist.min.js"></script>
    <script type="text/javascript" src="https://dl.dropboxusercontent.com/u/243766780/jplayer/popcorn/popcorn.jplayer.js"></script>
    <script type="text/javascript" src="https://dl.dropboxusercontent.com/u/243766780/jplayer/add-on/jquery.jplayer.inspector.js"></script>
    <script type="text/javascript" src="https://dl.dropboxusercontent.com/u/243766780/jplayer/css/jquery.jplayer.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.3.min.js"></script> 
	<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script> 
	<script src="../js/codigo.js"></script>
    <script type="text/javascript">
        
        $(document).ready(function () {
            $.post("/Meerkat_0.0/login", {
			});
            new jPlayerPlaylist({
                jPlayer: "#jquery_jplayer_1",
                cssSelectorAncestor: "#jp_container_1"
            }, [
                {
                    title: "TU AMOR ME HACE BIEN",
                    mp3: "../pistas/Tu Amor Me Hace Bien.mp3",
                },
                {
                    title: "EL APACHURRAO",
                    mp3: "../pistas/apachurrado.mp3",
                },
				{
                    title: "AHORA LLORAS POR MI",
                    mp3: "../pistas/Ahora Lloras Por Mi.mp3",
                },
                {
                    title: "AY VAMOS!",
                    mp3:"../pistas/J. Balvin - Ay Vamos.mp3",
                },

				{
                    title: "LIMONCITO CON RON",
                    mp3: "../pistas/limoncito con ron.mp3",
                },

				{
                    title: "ES MERENGUE NO ES MERENGUE",
                    mp3: "../pistas/es merengue no es merengue.mp3",
                },
                {
                    title: "COMO LO HIZO",
                    mp3: "../pistas/como lo hizo.mp3",
                },
                {
                    title: "RECUERDOS DE UN AMOR",
                    mp3: "../pistas/recuerdos de un amor.mp3",
                },
                {
                    title: "AMARTE MAS NO PUDE",
                    mp3: "../pistas/Amarte Más No Pude.mp3",
                },
                    {
                    title: "EL DIARIO DE UN CRUDO",
                    mp3: "../pistas/el diario de un crudo.mp3",
                },
                {
                    title: "NO PUEDO OLVIDARLA",
                    mp3: "../pistas/No Puedo Olvidarla.mp3",
                }

             ], {
                swfPath: "../js",
                supplied: "oga, mp3",
                wmode: "window",
                smoothPlayBar: true,
                keyEnabled: true
            });

            $("#jplayer_inspector_1").jPlayerInspector({ jPlayer: $("#jquery_jplayer_1") });
        });
    </script>
</head>

<body background="../images/fondomusica.jpg">

<div id="lista1">aqui</div>
<div id="global" align="center">
	<div id="jquery_jplayer_1" class="jp-jplayer"></div>
	
			<div id="jp_container_1" class="jp-audio">
				<div class="jp-type-playlist">
					<div class="jp-gui jp-interface">
						<ul class="jp-controls">
	<li><a href="javascript:;" class="jp-previous" tabindex="1"title="Anterior">Anterior</a></li>
	<li><a href="javascript:;" class="jp-play" tabindex="1" title="Reproducir">play</a></li>
	<li><a href="javascript:;" class="jp-pause" tabindex="1" title="Pausa">pausa</a></li>
	<li><a href="javascript:;" class="jp-next" tabindex="1" title="Siguiente">Siguiente</a></li>
	<li><a href="javascript:;" class="jp-stop" tabindex="1" title="Detener">Detener</a></li>
	<li><a href="javascript:;" class="jp-mute" tabindex="1" title="Silencio">Silencio</a></li>
	<li><a href="javascript:;" class="jp-unmute" tabindex="1" title="Sonido">Sonido</a></li>
	<li><a href="javascript:;" class="jp-volume-max" tabindex="1" title="máximo volumen">máximo volumen</a></li>
	</ul>
						
	<div class="jp-progress">
	<div class="jp-seek-bar">
	<div class="jp-play-bar">
	</div>
	</div>
	</div>
	
	<div class="jp-volume-bar" style="background:#0924F2">   <!--Color de fondo de un control -->
	<div class="jp-volume-bar-value">
	</div>
	</div>
	
	<div class="jp-current-time" title="Tiempo transcurrido">
	</div>
	<div class="jp-duration" title="Duración del audio">
	</div>
	
	<ul class="jp-toggles">
	<li><a href="javascript:;" class="jp-shuffle" tabindex="1" title="Aleatorio">shuffle</a></li>
	<li><a href="javascript:;" class="jp-shuffle-off" tabindex="1" title="Desactivar aleatorio">shuffle off</a></li>
	<li><a href="javascript:;" class="jp-repeat" tabindex="1" title="Repetir la lista">Repetir</a></li>
	<li><a href="javascript:;" class="jp-repeat-off" tabindex="1" title="Desactivar repetir lista">repeat off</a></li>
	</ul>
	</div>
	<div class="jp-playlist">
		<ul>
		<li></li>
		</ul>
	</div>
	<div class="jp-no-solution">
	<span>Update Required</span>
	To play the media you will need to either update your browser to a recent version or update your <a href="http://get.adobe.com/flashplayer/" target="_blank">Flash plugin</a>.
	</div>
	</div>
	</div>
	<div id="boton" onclick="actualizarlista()">Actualizar</div>
</div>
</body>
</html>