ALTER TABLE ${ohdsiSchema}.COHORT_DEFINITION
  ADD guid VARCHAR,
  organization VARCHAR NOT NULL DEFAULT 'OHDSI',
  model_version VARCHAR NOT NULL DEFAULT '5.1',
  model_type VARCHAR NOT NULL DEFAULT 'CDM',
  version VARCHAR,
  author_username VARCHAR,
  author_name VARCHAR;
