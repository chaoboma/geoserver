/*! @maps4html/mapml 05-09-2024 */

class MapSelect extends HTMLElement{static get observedAttributes(){return["name","id"]}get name(){return this.getAttribute("name")}set name(e){this.setAttribute("name",e)}get id(){return this.getAttribute("id")}set id(e){this.setAttribute("id",e)}attributeChangedCallback(e,t,r){e}constructor(){super()}connectedCallback(){this._extentEl=this.parentElement,this._createLayerControlForSelect()}disconnectedCallback(){}_createLayerControlForSelect(){this.htmlselect=this.transcribe();var e=L.DomUtil.create("details","mapml-layer-item-details mapml-control-layers"),t=L.DomUtil.create("summary"),r=L.DomUtil.create("label");r.innerText=this.getAttribute("name"),r.setAttribute("for",this.getAttribute("id")),t.appendChild(r),e.appendChild(t),e.appendChild(this.htmlselect),this.selectdetails=e;e=function(){this.parentElement._extentLayer.redraw()}.bind(this);this.htmlselect.addEventListener("change",e)}transcribe(){var r=document.createElement("select"),t=this.getAttributeNames();for(let e=0;e<t.length;e++)r.setAttribute(t[e],this.getAttribute(t[e]));var i=this.children;for(let t=0;t<i.length;t++){var a=document.createElement("option"),n=i[t].getAttributeNames();for(let e=0;e<n.length;e++)a.setAttribute(n[e],i[t].getAttribute(n[e]));a.innerHTML=i[t].innerHTML,r.appendChild(a)}return r}whenReady(){return new Promise((t,r)=>{let i,a;this.selectdetails?t():(i=setInterval(function(e){e.selectdetails?(clearInterval(i),clearTimeout(a),t()):e.isConnected||(clearInterval(i),clearTimeout(a),r("map-select was disconnected while waiting to be ready"))},300,this),a=setTimeout(function(){clearInterval(i),clearTimeout(a),r("Timeout reached waiting for map-select to be ready")},1e4))})}}export{MapSelect};
//# sourceMappingURL=map-select.js.map