# Freestyle-seed

This is a Giter8 template with the necessary for a Freestyle project.

The template include a `Hello World` with the desirable algebra structure 

## Creating New Freestyle Project

1. Create a new project from Freestyle g8 seed template:

```scala
sbt new frees-io/freestyle-seed.g8
```

2. Fill the required information (you can see an example below):

```bash

...

name [Project Name]: freestyle-rpc
projectDescription [Project Description]: RPC with Freestyle
project [project-name]: freestyle-rpc
package [freestyle]:
Skipping existing file: ./freestyle-rpc/.gitignore

Template applied in ./freestyle-rpc
```

The new project will be created in a new folder in the root directoy of this project with the name introduced before. It will contain the basic structure and basic sbt configuration based on the `sbt-freestyle` and `sbt-org-policies` plugins.
