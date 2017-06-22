ALTER TABLE ${ohdsiSchema}.COHORT_DEFINITION
  ADD guid VARCHAR,
  ADD organization VARCHAR NOT NULL DEFAULT 'OHDSI',
  ADD model_version VARCHAR NOT NULL DEFAULT '5.1',
  ADD model_type VARCHAR NOT NULL DEFAULT 'CDM',
  ADD version VARCHAR,
  ADD author_username VARCHAR,
  ADD author_name VARCHAR;

COMMENT ON COLUMN ${ohdsiSchema}.COHORT_DEFINITION.guid IS 'Global unique id for Cohort Definition';
COMMENT ON COLUMN ${ohdsiSchema}.COHORT_DEFINITION.organization IS 'Organization name';
COMMENT ON COLUMN ${ohdsiSchema}.COHORT_DEFINITION.model_version IS 'Version number of model';
COMMENT ON COLUMN ${ohdsiSchema}.COHORT_DEFINITION.model_type IS 'Model type should be one of CDM, I2B2 or CDISK';
COMMENT ON COLUMN ${ohdsiSchema}.COHORT_DEFINITION.version IS 'Version of Cohort';
COMMENT ON COLUMN ${ohdsiSchema}.COHORT_DEFINITION.author_username IS 'Cohort Author`s username';
COMMENT ON COLUMN ${ohdsiSchema}.COHORT_DEFINITION.author_name IS 'Cohort Author`s full name';