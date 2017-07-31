(ns bluegenes.db)

(def default-db
  {:name "Intermine"
   :mine-name :flymine
   ;;events/boot.cljs auto-selects the first mine available if current-mine
   ;;doesn't exist for any reason.
   :current-mine :flymine
   :saved-data {:items {}}
   :quicksearch-selected-index -1 ;;this defaults to select all in the quicksearch
   :databrowser/whitelist #{:Gene :Author :Protein :Organism :Publication :GOAnnotation :GOTerm :Homologue :Interaction :DataSet :genes :authors :proteins :organisms :publications :goAnnotation :goTerms :homologues :dataSets :interactions}
   :databrowser/root nil ;The default place to start in the data browser at /explore
   :databrowser/node-locations {:Homologue {:x 120 :y 224 :radius 50} :Protein {:x 200 :y 300 :radius 17}}
   :results {:history []}
   :search {:selected-results #{}}
   :mymine {:type :folder
            :open true
            :children [{:type :folder
                        :open true
                        :label "Folder One"}
                       {:type :folder
                        :open false
                        :label "Folder Two"
                        :children [{:type :folder
                                    :open false
                                    :label "Folder Three"
                                    :children [{:type :list
                                                :label "Some List"}
                                               {:type :list
                                                :label "Some List"}
                                               {:type :list
                                                :label "Some List"}]}]}
                       {:type :folder
                        :open true
                        :label "Folder FOUR"}]}
   :lists {:controls {:filters {:text-filter nil
                                :flags {:authorized nil
                                        :favourite nil}}
                      :sort {:title :asc}}}

   :qb {:root-class :Gene
        :order []
        :qm nil
        :mappy {"Gene" {"secondaryIdentifier" {}, "organism" {"name" {}}, "symbol" {}}}}})
