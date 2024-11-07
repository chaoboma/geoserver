    <div class="card-body">
      <#if model.getProperties()??>
      <ul id="sortables">
      <#list model.getProperties() as name, definition>
        <li><b>${name}</b>: ${definition.getTitle()}</li>
      </#list>
      </ul>
      <#else>
      <div class="p-3 mb-2 bg-warning text-dark">No sortables found.</div>
      </#if>
    </div>
