ALTER TABLE ${ohdsiSchema}.COHORT_DEFINITION
  ADD (
  guid VARCHAR2(32),
  organization VARCHAR2(4000) DEFAULT 'OHDSI' NOT NULL,
  model_version VARCHAR2(4000) DEFAULT '5.1' NOT NULL,
  model_type VARCHAR2(4000) DEFAULT 'CDM' NOT NULL,
  version VARCHAR2(4000),
  author_username VARCHAR2(4000),
  author_name VARCHAR2(4000)
  );
