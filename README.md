# GeoRegistro

Aplicación Android en Java para registrar incidencias georreferenciadas.

## Funciones
- Inicio y navegación.
- Formulario con título, descripción, categoría, fecha/hora y coordenadas.
- Validación de campos.
- Firebase Cloud Firestore.
- Inicio de sesión anónimo de Firebase para aplicar reglas básicas.
- GPS y permisos en tiempo de ejecución.
- Google Maps con marcador de la última incidencia.
- Acelerómetro y detección sencilla de movimiento.
- Manejo de errores básicos.
- README y declaración de IA.

## Configuración obligatoria antes de ejecutar
1. Abrir la carpeta `GeoRegistro` en Android Studio.
2. Crear un proyecto en Firebase.
3. Agregar una app Android con paquete `cl.ipvg.georegistro`.
4. Descargar `google-services.json` y colocarlo en `app/`.
5. En Firebase Authentication, habilitar el proveedor **Anónimo**.
6. Crear Cloud Firestore.
7. Publicar las reglas de `firestore.rules`.
8. En Google Cloud, habilitar **Maps SDK for Android** y crear una API Key.
9. Copiar `secrets.properties.example` como `secrets.properties` y colocar la clave real.
10. No subir `secrets.properties` a GitHub.

El proyecto no puede incluir tus archivos reales de Firebase ni tu API Key porque son configuraciones propias de tu cuenta.

## Ejecutar
Conectar un teléfono Android con depuración USB o usar un emulador con Google Play y presionar Run.

## Demostración
Registrar -> obtener GPS -> guardar -> Historial -> Mapa -> Sensor.

## Pruebas
- Guardar sin título.
- Guardar sin descripción.
- Denegar permiso de ubicación.
- Probar sin Internet.
- Probar sensor en un dispositivo compatible.
- Probar mapa después de configurar la API Key.

## GitHub
La evaluación solicita repositorio público y al menos 6 commits significativos. Recomendación:
1. estructura inicial
2. interfaz/navegación
3. formulario/validaciones
4. Firebase/Firestore
5. GPS
6. Maps/sensor
7. documentación/pruebas

## Seguridad
Las reglas propuestas permiten operaciones solo a usuarios autenticados. La aplicación usa autenticación anónima. No subir claves secretas ni datos personales reales.
