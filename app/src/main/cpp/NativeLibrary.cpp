//
// Created by jacob on 11/15/20.
//

#include "NativeLibrary.h"

namespace NativeLibrary {

const std::string& NativeClass::get_property() { return property; }
void NativeClass::set_property(const std::string& property) { this->property = property; }

} // namespace NativeLibrary
