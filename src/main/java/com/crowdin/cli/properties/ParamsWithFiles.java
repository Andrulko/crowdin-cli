package com.crowdin.cli.properties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import picocli.CommandLine;

@EqualsAndHashCode(callSuper = true)
@Data
public class ParamsWithFiles extends ProjectParams {

    @CommandLine.Option(names = {"-s", "--source"}, paramLabel = "...", descriptionKey = "params.source")
    private String sourceParam;

    @CommandLine.Option(names = {"-t", "--translation"}, paramLabel = "...", descriptionKey = "params.translation")
    private String translationParam;

    @CommandLine.Option(names = {"--skip-untranslated-strings"}, descriptionKey = "params.skipUntranslatedStrings")
    protected Boolean skipTranslatedOnly;

    @CommandLine.Option(names = {"--skip-untranslated-files"}, descriptionKey = "params.skipUntranslatedFiles")
    protected Boolean skipUntranslatedFiles;

    @CommandLine.Option(names = {"--export-only-approved"}, descriptionKey = "params.exportOnlyApproved")
    protected Boolean exportApprovedOnly;
}
