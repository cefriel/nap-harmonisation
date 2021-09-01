# nap-metadata-harmonisation
This repository contains the configuration files for the prototype supporting National Access Point Federation via Metadata Harmonisation. The prototype defines mappings for the NAPs of Belgium, France and Netherlands.

The repository is structured as follows:

- `rml` contains the [RML](https://rml.io/) mappings and related functions (described using [FnO](https://fno.io/) and used in the mappings)
- `chimera-route` contains the route to configure a [Chimera](https://github.com/cefriel/chimera) converter applying RML mappings to the metadata exposed by National Access Point
- `asset-manager` contains the configuration to query the different NAP assets in the prototype

