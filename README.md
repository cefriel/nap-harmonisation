# nap-metadata-harmonisation
This repository contains the configuration files for the prototype supporting National Access Point Federation via Metadata Harmonisation. The prototype defines mappings for the NAPs of Belgium, France and Netherlands.

The repository is structured as follows:

- `rml` contains the [RML](https://rml.io/) mappings and related functions (described using [FnO](https://fno.io/) and used in the mappings)
- `chimera-route` contains the route to configure a [Chimera](https://github.com/cefriel/chimera) converter applying RML mappings to the metadata exposed by National Access Point
- `asset-manager` contains the configuration to query the different NAP assets in the prototype

The content of this repository is discussed in detail in:
> Alessio Carenini, Andrea Fiano, Mario Scrocca, Marco Comerio and Irene Celino. _Enabling Cross-Border Travel Offers Through National Access Point Federation via Metadata Harmonisation_. Proceedings of the 3rd International Workshop Semantics And The Web For Transport co-located with Semantics Conference (SEMANTiCS 2021). http://ceur-ws.org/Vol-2939/paper6.pdf

Please cite this paper if you use the content of this repository in your work.

