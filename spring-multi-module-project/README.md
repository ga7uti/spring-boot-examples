# Spring Multi Module Project
This repository is intended to build to demontrate multi module maven project. A multi-module project is built from an 
aggregator POM that manages a group of submodules. In most cases, the aggregator is located in the project's root 
directory and must have packaging of type pom.Now, the submodules are regular Maven projects, and they can be built 
separately or through the aggregator POM.By building the project through the aggregator POM, each project that has
packaging type different than pom will result in a built archive file.

### Packing Type
``` 	
<packaging>pom</packaging>
```
### Modules
```
<modules>
  <module>author</module>
  <module>book</module>
</modules>
```
