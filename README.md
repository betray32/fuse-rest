# Descripcion del proyecto

Arquetipo de desarrollo para servicios rest en jboss fuse, el concepto detras del arquetipo es eliminar la complejidad propia de los desarrollos en fuse implementando camel y/o spring

# Compilación

Para compilar el proyecto es con

> mvn package

Para instalar en el equipo (necesario, ya que posteriormente el fuse toma los componentes desde nuestro directorio .m2)

> mvn clean install

# Instalacion en Fuse
Para instalar en fuse

> osgi:install -s mvn:cl.poc.fuse.rest/fuse-rest/0.0.1-SNAPSHOT

Revisar instalación

> osgi:list

# Testing Web

Para visualizar si está correctamente instalado acceder a la siguiente url

> http://localhost:8181/cxf

En donde se listará el servicio respectivamente

# Tecnologías Utilizadas
- Jboss FUSE
- Apache CXF
- Apache Camel

# Requisitos
- Jboss Fuse 6.3
- Java JDK 1.8
