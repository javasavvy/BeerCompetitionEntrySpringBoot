define(["doh/runner"], function(doh) {
	// summary:
	//		A sample DOH plugin showing wrapping/augmentation of DOH
	//		We extend the 'run' method	to inject a 'beer world' kind of statement into the output
	var origRun = doh.run, 
		registered = false;

	doh.run = function() {
		if(!registered) {
			doh.debug("doh.plugins.beer plugin says Hello!");
			registered = true;
		}
		origRun.apply(doh, arguments);
	}
});
