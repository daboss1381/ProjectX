class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		//"/"(view:"login/auth")
                "/"(view:"index")
		"500"(view:'/error')
	}
}